package com.gcu.topic22.data;

import com.gcu.topic22.model.OrderModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;
import org.springframework.stereotype.Service;

import javax.sql.DataSource;
import java.util.ArrayList;
import java.util.List;
@Service
public class OrdersDataService implements DataAccessInterface <OrderModel>{
    @Autowired
    private DataSource dataSource;

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public OrdersDataService(DataSource dataSource) {
        this.setDataSource(dataSource);
        this.jdbcTemplate = new JdbcTemplate(dataSource);
    }

    @Override
    public List<OrderModel> findall() {
        String sql = "SELECT * FROM ORDERS";
        List<OrderModel> orders = new ArrayList<>();
        try {
            SqlRowSet srs = jdbcTemplate.queryForRowSet(sql);
            while (srs.next()){
                orders.add(new OrderModel(srs.getLong("ID"), srs.getString("ORDER_NO"),
                        srs.getString("PRODUCT_NAME"), srs.getFloat("PRICE"), srs.getInt("QUANTITY")));
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return orders;
    }

    @Override
    public OrderModel findById(int id) {
        return null;
    }

    @Override
    public boolean create(OrderModel order) {
        String sql = "INSERT INTO ORDERS(ORDER_NO, PRODUCT_NAME, PRICE, QUANTITY) VALUES(?,?,?,?)";
        try {
            int rows = jdbcTemplate.update(sql, order.getOrderNo(), order.getProductName(), order.getPrice(), order.getQuantity());
            if(rows == 1){
                return true;
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public boolean update(OrderModel order) {
        return false;
    }

    @Override
    public boolean delete(OrderModel order) {
        return false;
    }

	public DataSource getDataSource() {
		return dataSource;
	}

	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
	}
}

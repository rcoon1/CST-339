package com.gcu.topic22.business;

import com.gcu.topic22.model.OrderModel;

import java.util.ArrayList;
import java.util.List;

public class AnotherOrdersBusinessService implements OrdersBusinessServiceInterface{
    @Override
    public void test() {
        System.out.println("Hello from AnotherOrdersBusinessService");
    }

    @Override
    public List<OrderModel> getOrders() {
        List<OrderModel> orders = new ArrayList<OrderModel>();
        orders.add(new OrderModel(0L, "00000001", "Product 1", 1.00f, 1));
        orders.add(new OrderModel(1L, "00000002", "Product 2", 2.00f, 2));
        orders.add(new OrderModel(2L, "00000003", "Product 3", 3.00f, 3));
        orders.add(new OrderModel(3L, "00000004", "Product 4", 4.00f, 4));
        orders.add(new OrderModel(4L, "00000005", "Product 5", 5.00f, 5));
        return orders;
    }

    @Override
    public void init() {
        System.out.println("Hello from AOBS init()");
    }

    @Override
    public void destroy() {
        System.out.println("Hello from AOBS destroy()");
    }
}

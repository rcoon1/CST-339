package com.gcu.topic22.business;

import com.gcu.topic22.data.DataAccessInterface;
import com.gcu.topic22.model.OrderModel;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class OrdersBusinessService implements OrdersBusinessServiceInterface{
    @Autowired
    private DataAccessInterface<OrderModel> service;

    @Override
    public void test() {
        System.out.println("Hello from OrdersBusinessService");
    }

    @Override
    public List<OrderModel> getOrders() {
        System.out.println("Generating a list from getOrders()");
        return service.findall();
    }

    @Override
    public void init() {
        System.out.println("Hello from OBS init()");
    }

    @Override
    public void destroy() {
        System.out.println("Hello from OBS destroy()");
    }
}

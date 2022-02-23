package com.gcu.topic22.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.gcu.topic22.business.OrdersBusinessService;

@Controller
@RequestMapping("/orders")
public class OrdersController {

    @Autowired
    private OrdersBusinessService service;

    @GetMapping("/display")
    public String displayOrders(Model model){
        model.addAttribute("title", "My Orders");
        model.addAttribute("orders", service.getOrders());
        return "orders";
    }
}
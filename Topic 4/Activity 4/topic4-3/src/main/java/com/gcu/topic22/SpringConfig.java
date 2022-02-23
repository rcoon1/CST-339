package com.gcu.topic22;

import com.gcu.topic22.business.AnotherOrdersBusinessService;
import com.gcu.topic22.business.OrdersBusinessService;
import com.gcu.topic22.business.OrdersBusinessServiceInterface;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.web.context.annotation.RequestScope;
import org.springframework.web.context.annotation.SessionScope;

@Configuration
public class SpringConfig {

    @Bean(name = "ordersBusinessService", initMethod = "init", destroyMethod = "destroy")
    public OrdersBusinessServiceInterface getOrdersBusiness(){
        return new OrdersBusinessService();
    }
}

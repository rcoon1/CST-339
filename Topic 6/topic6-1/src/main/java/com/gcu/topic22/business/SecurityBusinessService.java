package com.gcu.topic22.business;

import org.springframework.stereotype.Service;

@Service
public class SecurityBusinessService {

    public boolean authenticate(String username, String password){
        System.out.println("Hello from the SecurityBusinessService");
        System.out.println("THe username entered is: " + username);
        System.out.println("THe password entered is: " + password);
        return true;
    }
}

package com.xl.serviceaccount.clients.fallback;


import com.xl.serviceaccount.clients.IOrderServiceWrapper;
import org.springframework.stereotype.Component;

@Component
public class OrderServiceFusing implements IOrderServiceWrapper {
    @Override
    public String sayHiFromClientOne(String name) {
        return "sorry -- "+name;
    }
}

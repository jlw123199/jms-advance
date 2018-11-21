package com.xl.sericefeign.clients.fallback;

import com.xl.sericefeign.clients.IOrderServiceWrapper;
import org.springframework.stereotype.Component;

@Component
public class OrderServiceFusing implements IOrderServiceWrapper {
    @Override
    public String sayHiFromClientOne(String name) {
        return "sorry -- "+name;
    }
}

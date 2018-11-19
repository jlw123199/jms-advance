package com.xl.sericefeign;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderServiceController {

    @Autowired
    IOrderServiceWrapper orderServiceWrapper;

    @GetMapping(value = "/hi")
    public String sayHi(@RequestParam String name) {
        return orderServiceWrapper.sayHiFromClientOne( name );
    }


}

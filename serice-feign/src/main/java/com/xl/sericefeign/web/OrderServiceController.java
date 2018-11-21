package com.xl.sericefeign.web;

import com.xl.sericefeign.clients.IOrderServiceWrapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderServiceController {

    @Autowired
    IOrderServiceWrapper iOrderServiceWrapper;

    @GetMapping(value = "/hi")
    public String sayHi(@RequestParam String name) {
        return iOrderServiceWrapper.sayHiFromClientOne( name );
    }


}

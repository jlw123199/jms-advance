package com.xl.serviceaccount.web;


import com.xl.serviceaccount.clients.IOrderServiceWrapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/account/")
public class AccountServiceController {

    @Autowired
    IOrderServiceWrapper iOrderServiceWrapper;


    @RequestMapping(value = "/ping")
    public String ping() {
        String a = "123";
        String b = "123";
        return "Pong - account Controller";
    }

    @GetMapping(value = "/order")
    public String invokeOrder(@RequestParam String name) {
        return iOrderServiceWrapper.sayHiFromClientOne( name );
    }





}

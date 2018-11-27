package com.xl.servicestore;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@Service
@RestController
@RequestMapping(value = "/stroe/")
public class StoreController {
    @RequestMapping(value = "/ping")
    public String ping() {
        return "Pong - Store Controller";
    }

    @Autowired
    OrderServiceConsumer orderServiceConsumer;


    @RequestMapping(value = "/order")
    public String hi(@RequestParam String name) {
        return orderServiceConsumer.hiService( name );
    }

}

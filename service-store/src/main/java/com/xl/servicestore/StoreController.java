package com.xl.servicestore;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping(value ="/stroe/")
public class StoreController {
    @RequestMapping(value = "/ping")
    public String ping(){
        return "Pong - Store Controller";
    }

    @Autowired
    RestTemplate restTemplate;

    @RequestMapping(value = "/order")
    public String order(String name) {
        return restTemplate.getForObject("http://ORDER-SERVICE/hi?name=" + name, String.class);
    }

}

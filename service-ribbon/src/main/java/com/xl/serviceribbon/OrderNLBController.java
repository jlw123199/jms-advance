package com.xl.serviceribbon;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderNLBController {



    @Autowired
    OrderServiceConsumer orderServiceConsumer;

    @GetMapping(value = "/hi")
    public String hi(@RequestParam String name) {
        return orderServiceConsumer.hiService( name );
    }

}

package com.xl.serviceuser;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;


@RestController
public class UserController {

    @Autowired
    private RestTemplate restTemplate = new RestTemplate();

//    @Autowired
//    private RestTemplate restTemplate;

    @RequestMapping("/listOrdersByUserID")
    public String listOrdersByUserID(@RequestParam(value = "userID", defaultValue = "forezp") String userID) {

//        return restTemplate.getForObject("http://localhost:8988/info",String.class);

        return restTemplate.getForObject("http://ORDER-SERVICE/hi?name="+userID,String.class).toString();

//        return "TNT";

    }

    @Autowired
    OrderServiceConsumer  orderServiceConsumer;

    @RequestMapping("/test")
    public String Test()  {
        return "TNT" +"---" + orderServiceConsumer.hiService("ttt");
    }

}

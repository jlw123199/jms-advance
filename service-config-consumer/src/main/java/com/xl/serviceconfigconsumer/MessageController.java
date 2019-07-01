package com.xl.serviceconfigconsumer;

import com.xl.serviceconfigconsumer.config.ServiceConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//@RefreshScope
@RestController
@Service
public class MessageController {


    @Autowired
    private StringRedisTemplate stringRedisTemplate;


    @Autowired
    private ServiceConfig serviceConfig;

//    @Value("${message:Hello default}")
//    private String message;


    @RequestMapping("/message")
    String getMessage() {

        String name = "保存字符串11";
        // 保存字符串
        stringRedisTemplate.opsForValue().set("name", name);
        String rString =  stringRedisTemplate.opsForValue().get("name");

        return  rString + serviceConfig.getExampleProperty();
//        return this.message  + serviceConfig.getExampleProperty();
    }


}



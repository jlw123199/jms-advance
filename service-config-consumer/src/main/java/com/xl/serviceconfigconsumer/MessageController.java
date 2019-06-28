package com.xl.serviceconfigconsumer;

import com.xl.serviceconfigconsumer.config.ServiceConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RefreshScope
@RestController
@Service
public class MessageController {

    @Autowired
    private ServiceConfig serviceConfig;

    @Value("${message:Hello default}")
    private String message;


    @RequestMapping("/message")
    String getMessage() {
        return this.message  + serviceConfig.getExampleProperty();
    }
}

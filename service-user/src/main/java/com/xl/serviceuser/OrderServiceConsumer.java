package com.xl.serviceuser;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class OrderServiceConsumer {


    @Autowired
    RestTemplate restTemplate;

    @Autowired
    private LoadBalancerClient loadBalancerClient;

    public String hiService(String name) {
        return restTemplate.getForObject("http://ORDER-SERVICE/hi?name="+name,String.class);

    }


    @Bean
    public  RestTemplate restTemplate() {
        return new RestTemplate();
    }



}

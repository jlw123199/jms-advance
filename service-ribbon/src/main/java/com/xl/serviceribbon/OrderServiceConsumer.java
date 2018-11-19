package com.xl.serviceribbon;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.net.URI;

@Service
public class OrderServiceConsumer {


    @Autowired
    RestTemplate restTemplate;

    @Autowired
    private LoadBalancerClient loadBalancerClient;


    public String hiService(String name) {
        return restTemplate.getForObject("http://ORDER-SERVICE/hi?name="+name,String.class);


//        ServiceInstance instance = this.loadBalancerClient.choose("ORDER-SERVICE");
//        URI helloUri = URI.create(String.format("http://%s:%s/hi?name=+%s", instance.getHost(), instance.getPort(),name));
//
//        String str  = String.format("hh---/%s","aaa");
//        return new RestTemplate().getForEntity(helloUri, String.class).getBody();
    }

}

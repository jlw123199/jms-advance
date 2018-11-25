package com.xl.serviceribbon;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class OrderServiceConsumer {


    @Autowired
    RestTemplate restTemplate;

    @Autowired
    private LoadBalancerClient loadBalancerClient;

    @HystrixCommand(fallbackMethod = "hiError")
    public String hiService(String name) {
        return restTemplate.getForObject("http://ORDER-SERVICE/hi?name="+name,String.class);


//        ServiceInstance instance = this.loadBalancerClient.choose("ORDER-SERVICE");
//        URI helloUri = URI.create(String.format("http://%s:%s/hi?name=+%s", instance.getHost(), instance.getPort(),name));
//
//        String str  = String.format("hh---/%s","aaa");
//        return new RestTemplate().getForEntity(helloUri, String.class).getBody();
    }

    public String hiError(String name) {
        return "hi,"+name+",sorry,error!";
    }


}

package com.xl.serviceaccount.clients;


import com.xl.serviceaccount.clients.fallback.OrderServiceFusing;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value ="order-service",fallback = OrderServiceFusing.class )
public interface IOrderServiceWrapper {

    @RequestMapping(value = "/hi",method = RequestMethod.GET)
    String sayHiFromClientOne(@RequestParam(value = "name") String name);

}

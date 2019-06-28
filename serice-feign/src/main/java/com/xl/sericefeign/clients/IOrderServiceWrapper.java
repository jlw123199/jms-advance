package com.xl.sericefeign.clients;

import com.xl.sericefeign.clients.fallback.OrderServiceFusing;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value ="user-service",fallback = OrderServiceFusing.class )
public interface IUserServiceWrapper {

    @RequestMapping(value = "/hi",method = RequestMethod.GET)
    String sayHiFromClientOne(@RequestParam(value = "name") String name);

}

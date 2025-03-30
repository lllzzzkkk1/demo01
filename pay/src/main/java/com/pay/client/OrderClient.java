package com.pay.client;/*@date 2025-03-09-下午5:44
 */


import org.springframework.cloud.loadbalancer.core.RandomLoadBalancer;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "order-service" )

public interface OrderClient {


    @GetMapping("/test01")
     String test() ;

}


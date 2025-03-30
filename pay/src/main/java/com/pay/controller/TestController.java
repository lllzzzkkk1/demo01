package com.pay.controller;/*@date 2025-03-09-下午5:43
 */


import com.pay.client.OrderClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TestController {



//
    @Autowired
    private  OrderClient orderClient;

    @Autowired
    private DiscoveryClient discoveryClient;


    @GetMapping("/test")
    public String test() {

        List<ServiceInstance> instances = discoveryClient.getInstances("order-service");
        System.out.println("=============实例==="+instances);

        System.out.println("=============实例==="+instances.get(0).getUri());
        String test = orderClient.test();
        return  "pay 服务调用order接口" + orderClient.test();
    }

}

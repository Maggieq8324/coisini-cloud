package com.coisini.consumer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class RibbonHelloController {

    @Autowired
    private RestTemplate restTemplate;
    
    @RequestMapping("/ribbon/call")
    public String call() {
        // 调用服务, coisini-producer-server为注册的服务名称，LoadBalancerInterceptor会拦截调用并根据服务名找到对应的服务
        String callServiceResult = restTemplate.getForObject("http://coisini-producer-server/hello", String.class);
        return callServiceResult;
    }
}
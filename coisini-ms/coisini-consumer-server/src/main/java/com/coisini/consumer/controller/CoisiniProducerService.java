package com.coisini.consumer.controller;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(name = "coisini-producer-server", fallback = CoisiniProducerHystrix.class)
public interface CoisiniProducerService {

    @RequestMapping("/hello")
    public String hello();
    
}

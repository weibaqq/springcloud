package com.cw.feign.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "service-hi",fallback = HelloServiceHystric.class)
public interface HelloService {
    @RequestMapping("/hi")
    String myHello(@RequestParam("name") String name);
}


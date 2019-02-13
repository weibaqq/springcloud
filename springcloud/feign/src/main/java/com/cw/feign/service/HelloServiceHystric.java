package com.cw.feign.service;

import org.springframework.stereotype.Component;

@Component
public class HelloServiceHystric implements HelloService{
    @Override
    public String myHello(String name){
      return "sorry "+name;
    }
}

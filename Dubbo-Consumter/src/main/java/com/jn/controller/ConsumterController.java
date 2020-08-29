package com.jn.controller;

import com.jn.service.ProviderService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConsumterController {

    @Reference(version = "1.0.0")
    ProviderService providerService;

    @RequestMapping
    public String CA (){
         String name = providerService.A("张三");
         return name;
    }
}

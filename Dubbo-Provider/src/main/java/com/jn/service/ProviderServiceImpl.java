package com.jn.service;

import org.apache.dubbo.config.annotation.Service;

@Service(version = "1.0.0" ,interfaceClass = ProviderService.class, timeout = 10000)
public class ProviderServiceImpl  implements ProviderService {

    @Override
    public String A(String name) {
        System.out.println("........"+name);
        return name+" , Hello Word";
    }
}

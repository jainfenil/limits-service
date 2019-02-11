package com.springbootVersionOne.rest.webservices.restfulwebservices.limitsservice;

import com.springbootVersionOne.rest.webservices.restfulwebservices.limitsservice.bean.LimitConfiguration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LimitsConfigurationController {

    @Autowired
    private Configuration configuration;

    @GetMapping("/limits")
    public LimitConfiguration retriveLimitsFromConfiguration(){

        return new LimitConfiguration(configuration.getMaximum(),configuration.getMinimum());
    }
}

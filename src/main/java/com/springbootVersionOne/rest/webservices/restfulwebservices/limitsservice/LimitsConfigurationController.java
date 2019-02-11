package com.springbootVersionOne.rest.webservices.restfulwebservices.limitsservice;

import com.springbootVersionOne.rest.webservices.restfulwebservices.limitsservice.bean.LimitConfiguration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LimitsConfigurationController {

    @GetMapping("/limits")
    public LimitConfiguration retriveLimitsFromConfiguration(){

        return new LimitConfiguration(1000,1);
    }
}

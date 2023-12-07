package com.example.limitsservice.controller;


import com.example.limitsservice.beans.Limits;
import com.example.limitsservice.configuration.Configuration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LimitsController {
    @Autowired
    private Configuration configuration;

    @GetMapping("Limits")
    public Limits receiveLimits(){
        return new Limits(configuration.getMinimum(),configuration.getMaximum());
    }
}

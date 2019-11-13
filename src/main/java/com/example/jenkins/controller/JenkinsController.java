package com.example.jenkins.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

@RestController
public class JenkinsController {


    @RequestMapping(value = "/", method = GET)
    public @ResponseBody String home() {
        return "Hello Jenkins";
    }

}

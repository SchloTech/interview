package com.interview.resource;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeResource {

    @RequestMapping("/api/welcome")
    public String index() {

        return "Welcome to Jake's interview project!";
    }
}

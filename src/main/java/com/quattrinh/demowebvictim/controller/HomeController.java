package com.quattrinh.demowebvictim.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String index() {
        return "index";
    }

    @GetMapping("/privacy")
    public String privacy() {
        for (int i = 0; i < 90000000; i++)
        {
            // Perform a computationally intensive task
            int result = i * i;
        }
        return "privacy";
    }
}

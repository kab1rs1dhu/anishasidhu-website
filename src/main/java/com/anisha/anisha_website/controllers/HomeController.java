package com.anisha.anisha_website.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String home() {
        return "home";
    }
    
    @GetMapping("/education")
    public String education() {
        return "education";
    }
    
    @GetMapping("/collaborations")
    public String collaborations() {
        return "collaborations";
    }
    
    @GetMapping("/jobs")
    public String jobs() {
        return "jobs";
    }
    
    @GetMapping("/media-events")
    public String mediaEvents() {
        return "media-events";
    }
}
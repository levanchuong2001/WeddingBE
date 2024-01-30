package com.vuha.wedding;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/")
public class Controller {
    @GetMapping("/")
    public String GetPageHome() {
        return "index";
    }
}

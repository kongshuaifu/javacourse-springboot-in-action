package com.jimisun.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloSpringController {

    @RequestMapping("")
    public String index() {
        return "index";
    }
}

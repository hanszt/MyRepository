package com.mijninzet.projectteamdrie.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WelcomeScreenControllerAdmin {

    @RequestMapping(value = "/helloAdmin")
    public String hello() {
        return "helloAdmin";
    }
}

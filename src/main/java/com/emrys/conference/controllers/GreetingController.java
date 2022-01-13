package com.emrys.conference.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Map;

@Controller
public class GreetingController {


    @RequestMapping(value ="greeting", method = RequestMethod.GET)
    public String greeting(Map<String, Object> model){

        System.out.println("###########################");
        model.put("message","Hello Rojaya !");
        return "greeting";
    }

    @GetMapping("thyme")
    public String thyme(Map<String, Object> model ){
        model.put("message", "Hello Thyme!");
        return "thyme";
    }

}

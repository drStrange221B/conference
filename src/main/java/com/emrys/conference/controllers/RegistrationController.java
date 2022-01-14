package com.emrys.conference.controllers;

import org.springframework.stereotype.Controller;
import com.emrys.conference.model.Registration;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;

@Controller
public class RegistrationController {

    @GetMapping("registration")
    public String getRegistration(@ModelAttribute("registration") Registration registration){

        return "registration";

    }

    @PostMapping("registration")
    public String addRegistration(@Valid @ModelAttribute("registration") Registration registration,
                                  BindingResult result){
        if(result.hasErrors())
        {
            System.out.printf("There were errors!");
            return "registration";
        }

        System.out.println("Registration Name: " + registration.getName());

        return "redirect:registration";
    }

}

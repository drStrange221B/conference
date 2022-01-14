package com.emrys.conference.controllers;

import com.emrys.conference.model.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @GetMapping("user")
    public User getUser(@RequestParam(value="firstname", defaultValue = "Rojaya") String firstName,
                        @RequestParam(value = "lastname" , defaultValue = "Maharjan" ) String lastName,
                        @RequestParam(value="age", defaultValue = "33") int age){
        User user = new User();
        user.setAge(age);
        user.setFirstName(firstName);
        user.setLastName(lastName);

        return user;
    }

    @PostMapping("user")
    public User addUser(User user){
        System.out.printf("New User has been added " + user.getFirstName());
        return user;
    }
}

package com.szilardz.travelbucketlist.controller;

import com.szilardz.travelbucketlist.model.User;
import com.szilardz.travelbucketlist.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomePageController {

    @Autowired
    private UserService userService;


    @GetMapping("/user/{id}")
    public String homepage(@PathVariable Long id) {
        User user = userService.getUserById(id);
        return user.getEmail();
    }


}

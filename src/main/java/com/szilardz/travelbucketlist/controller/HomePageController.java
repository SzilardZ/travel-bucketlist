package com.szilardz.travelbucketlist.controller;

import com.szilardz.travelbucketlist.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomePageController {

    @Autowired
    private UserService userService;


//    @GetMapping("/user/{id}")
//    public String homepage(@PathVariable Long id) {
//        User user = userService.getUserById(id);
//        return user.getBucketList().getName();
//    }


}

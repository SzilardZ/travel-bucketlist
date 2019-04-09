package com.szilardz.travelbucketlist.controller;

import com.szilardz.travelbucketlist.model.User;
import com.szilardz.travelbucketlist.service.BucketListService;
import com.szilardz.travelbucketlist.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BucketListController {

    @Autowired
    private UserService userService;

    @Autowired
    private BucketListService bucketListService;

    @GetMapping("/user/{id}")
    public String homepage(@PathVariable Long id) {
        User user = userService.getUserById(id);
        return user.getEmail();
    }


}

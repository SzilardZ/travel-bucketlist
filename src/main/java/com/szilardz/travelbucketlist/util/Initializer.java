package com.szilardz.travelbucketlist.util;

import com.szilardz.travelbucketlist.model.BucketList;
import com.szilardz.travelbucketlist.model.User;
import com.szilardz.travelbucketlist.service.BucketListService;
import com.szilardz.travelbucketlist.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class Initializer {

    @Autowired
    private UserService userService;

    @Autowired
    private BucketListService bucketListService;

    @PostConstruct
    public void init() {
        User user = User.builder().firstName("Adam").lastName("Smith").email("adamsmith@yahoocom").build();
        userService.addUser(user);
        bucketListService.addBucketList(BucketList.builder().user(user).build());
    }

}

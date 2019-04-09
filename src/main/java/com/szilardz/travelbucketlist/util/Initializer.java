package com.szilardz.travelbucketlist.util;

import com.szilardz.travelbucketlist.model.BucketList;
import com.szilardz.travelbucketlist.model.User;
import com.szilardz.travelbucketlist.service.BucketListService;
import com.szilardz.travelbucketlist.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Initializer {

    @Autowired
    private UserService userService;

    @Autowired
    private BucketListService bucketListService;

    public void init() {
        User user = new User("Adam", "Smith", "adamsmith@yahoo.com");
        userService.addUser(user);
        bucketListService.addBucketList(new BucketList());
    }

}

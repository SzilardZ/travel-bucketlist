package com.szilardz.travelbucketlist.util;

import com.szilardz.travelbucketlist.model.BucketList;
import com.szilardz.travelbucketlist.model.Destination;
import com.szilardz.travelbucketlist.model.User;
import com.szilardz.travelbucketlist.service.BucketListService;
import com.szilardz.travelbucketlist.service.DestinationService;
import com.szilardz.travelbucketlist.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class Initializer {

    @Autowired
    private UserService userService;

    @Autowired
    private BucketListService bucketListService;

    @Autowired
    private DestinationService destinationService;

    @Bean
    public void init() {

        User user1 = User.builder().firstName("Adam").lastName("Smith").email("adamsmith@yahoocom").build();
        userService.addUser(user1);

        Destination destination1 = Destination.builder().location("Tel-Aviv").note("elmenni").build();
        destinationService.addDestination(destination1);

        Destination destination2 = Destination.builder().location("Baku").note("nana, hogy elmenni").build();
        destinationService.addDestination(destination2);

        bucketListService.addBucketList(BucketList.builder()
                .user(user1)
                .destination(destination1)
                .destination(destination2)
                .build());



        User user2 = User.builder().firstName("Steven").lastName("Tyler").email("steven@yahoo.com").build();
        userService.addUser(user2);

        Destination destination3 = Destination.builder().location("London").note("voltunk").build();
        destinationService.addDestination(destination3);

        Destination destination4 = Destination.builder().location("Dubai").note("menni megint").build();
        destinationService.addDestination(destination4);

        Destination destination5 = Destination.builder().location("Madrid").note("jovore").build();
        destinationService.addDestination(destination5);

        bucketListService.addBucketList(BucketList.builder()
                .user(user2)
                .destination(destination3)
                .destination(destination4)
                .destination(destination5)
                .destination(destination1)
                .build());


    }

}

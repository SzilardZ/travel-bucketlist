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

import java.time.LocalDate;

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

        createUser("Adam", "Smith", "adamsmith@yahoo.com");
        createUser("Steven", "Tyler", "steven@yahoo.com");
        createDestination((long) 1, "Tel-Aviv", "must have");
        createDestination((long) 1, "Baku", "of course must have!");
        createDestination((long) 2, "Reykjavik", "already done");
        createDestination((long) 2, "Dubai", "need to go again!");
        createDestination((long) 2, "Madrid", "next year?");

        LocalDate visitedFrom = LocalDate.of(2019, 4, 11);
        LocalDate visitedUntil = LocalDate.of(2019, 5, 13);

        destinationService.markDestinationAsVisited((long) 1, visitedFrom, visitedUntil);


    }

    private void createUser(String firstName, String lastName, String email) {
        BucketList bucketList = new BucketList();
        User user = User.builder()
                .firstName(firstName)
                .lastName(lastName)
                .email(email)
                .bucketList(bucketList)
                .build();
        bucketList.setUser(user);
        userService.addUser(user);
    }

    private void createDestination(Long bucketListId, String location, String note) {
        BucketList bucketList = bucketListService.getBucketListById(bucketListId);
        Destination destination = Destination.builder()
                .location(location)
                .note(note)
                .build();
        destination.setBucketList(bucketList);
        destinationService.addDestination(destination);
    }

}

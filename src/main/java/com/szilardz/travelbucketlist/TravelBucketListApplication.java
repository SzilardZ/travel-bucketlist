package com.szilardz.travelbucketlist;

import com.szilardz.travelbucketlist.model.BucketList;
import com.szilardz.travelbucketlist.model.Destination;
import com.szilardz.travelbucketlist.model.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TravelBucketListApplication {

    public static void main(String[] args) {
        SpringApplication.run(TravelBucketListApplication.class, args);

        User user1 = new User("Adam", "Smith", "adam@yahoo.com");

        BucketList bucketList = new BucketList(user1);

        bucketList.addDestination(new Destination("Baku", "what note", bucketList));
    }

}

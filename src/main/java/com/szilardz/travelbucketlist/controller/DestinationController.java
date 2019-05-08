package com.szilardz.travelbucketlist.controller;

import com.szilardz.travelbucketlist.model.Destination;
import com.szilardz.travelbucketlist.service.BucketListService;
import com.szilardz.travelbucketlist.service.DestinationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin
@RestController
public class DestinationController {

    @Autowired
    private BucketListService bucketListService;

    @Autowired
    private DestinationService destinationService;

//    @GetMapping("/{userId}")
//    public BucketList getBucketListByUserId(@PathVariable("userId") long id) {
//        return bucketListService.getBucketListByUserId(id);
//    }

    @GetMapping("/destinations")
    public List<Destination> getAllDestinations() {
        return destinationService.getAllDestinations();
    }
}
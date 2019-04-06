package com.szilardz.travelbucketlist.controller;

import com.szilardz.travelbucketlist.model.BucketList;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

@RestController
public class BucketListController {

    private List<BucketList> myBucketList = new ArrayList<>();
    private final AtomicLong COUNTER = new AtomicLong();

    public BucketListController() {
        myBucketList.add(new BucketList(COUNTER.incrementAndGet(), "Visit Colosseum in Rome"));
    }

    @GetMapping("/")
    public ResponseEntity index() {
        return ResponseEntity.ok(myBucketList);
    }

}

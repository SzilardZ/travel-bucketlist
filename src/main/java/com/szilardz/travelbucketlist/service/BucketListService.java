package com.szilardz.travelbucketlist.service;

import com.szilardz.travelbucketlist.model.BucketList;
import com.szilardz.travelbucketlist.repository.BucketListRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BucketListService {

    @Autowired
    private BucketListRepository bucketListRepository;

    public void addBucketList(BucketList bucketList) {
        bucketListRepository.save(bucketList);
    }
}

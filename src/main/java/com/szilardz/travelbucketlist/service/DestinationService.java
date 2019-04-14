package com.szilardz.travelbucketlist.service;

import com.szilardz.travelbucketlist.model.Destination;
import com.szilardz.travelbucketlist.repository.DestinationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DestinationService {

    @Autowired
    private DestinationRepository destinationRepository;

    public void addDestination(Destination destination) {
        destinationRepository.save(destination);
    }
}

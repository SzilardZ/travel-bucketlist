package com.szilardz.travelbucketlist.service;

import com.szilardz.travelbucketlist.model.Destination;
import com.szilardz.travelbucketlist.repository.DestinationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DestinationService {

    @Autowired
    private DestinationRepository destinationRepository;

    public void addDestination(Destination destination) {
        destinationRepository.save(destination);
    }

    public Destination getDestinationById(Long id) {
        return destinationRepository.getByDestinationId(id);
    }

    public List<Destination> getAllDestinationsByBucketList(Long id) {
        return destinationRepository.getDestinationsByBucketList_BucketListId(id);
    }

}

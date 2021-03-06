package com.szilardz.travelbucketlist.service;

import com.szilardz.travelbucketlist.model.Destination;
import com.szilardz.travelbucketlist.repository.DestinationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class DestinationService {

    @Autowired
    private DestinationRepository destinationRepository;

    public Destination addNewDestination(Destination destination) {
        return destinationRepository.save(destination);
    }

    public Destination getDestinationById(Long id) {
        return destinationRepository.getByDestinationId(id);
    }

    public List<Destination> getAllDestinationsByBucketListId(Long id) {
        return destinationRepository.getDestinationsByBucketList_BucketListId(id);
    }

    public List<Destination> getAllDestinations() {
        return destinationRepository.findAll();
    }

    public void deleteDestinationById(Long id) {
        destinationRepository.deleteById(id);
    }

    public void markDestinationAsVisited(Long id, LocalDate visitedFrom, LocalDate visitedUntil, String note) {
        Destination destination = getDestinationById(id);
        destination.setVisited(true);
        destination.setVisitedFrom(visitedFrom);
        destination.setVisitedUntil(visitedUntil);
        destination.setNote(note);
    }

}

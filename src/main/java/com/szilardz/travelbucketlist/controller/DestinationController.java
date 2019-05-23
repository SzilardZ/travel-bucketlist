package com.szilardz.travelbucketlist.controller;

import com.szilardz.travelbucketlist.model.Destination;
import com.szilardz.travelbucketlist.service.DestinationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/destinations")
public class DestinationController {


    @Autowired
    private DestinationService destinationService;


    @GetMapping("/")
    public List<Destination> getAllDestinations() {
        return destinationService.getAllDestinations();
    }

    @PostMapping("/add-destination")
    public Destination addNewDestination(@RequestBody Destination destination) {
        System.out.println("FSFSAFASFSA");
        return destinationService.addNewDestination(destination);
    }

    @DeleteMapping("/delete-destination/{id}")
    public void deleteDestinationById(@PathVariable("id") long id) {
        destinationService.deleteDestinationById(id);
    }

    @PutMapping("/add-to-visited/{id}")
    public void markDestinationAsVisited(@PathVariable("id") long id) {
        System.out.println("MMMMMMMMMMMMM" + id);
        LocalDate visitedUntil = LocalDate.ofEpochDay(2000-11-11);
        String note = "barmi";
//        destinationService.markDestinationAsVisited(id, LocalDate.parse(visitedFrom), visitedUntil, note);
    }

}

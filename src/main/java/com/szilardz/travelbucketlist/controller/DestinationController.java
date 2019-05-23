package com.szilardz.travelbucketlist.controller;

import com.szilardz.travelbucketlist.model.BucketList;
import com.szilardz.travelbucketlist.model.Destination;
import com.szilardz.travelbucketlist.model.User;
import com.szilardz.travelbucketlist.service.BucketListService;
import com.szilardz.travelbucketlist.service.DestinationService;
import com.szilardz.travelbucketlist.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/destinations")
public class DestinationController {


    @Autowired
    private DestinationService destinationService;

    @Autowired
    private UserService userService;

    @Autowired
    private BucketListService bucketListService;


    @GetMapping("/{username}")
    @PreAuthorize("hasRole('USER')")
    public List<Destination> getAllDestinationsByBucketList(@PathVariable("username") String username) {

        User user = userService.getUserByUsername(username);
        BucketList bucketList = bucketListService.getBucketListByUser(user);
        long id = bucketList.getBucketListId();
        return destinationService.getAllDestinationsByBucketListId(id);
    }

    @PostMapping("/add-destination/{username}")
    @PreAuthorize("hasRole('USER')")
    public Destination addNewDestination(@RequestBody Destination destination, @PathVariable("username") String username) {
        System.out.println("FSFSAFASFSA");

        User user = userService.findByUsername(username)
                .orElseThrow(() -> new UsernameNotFoundException("User not found with this username!"));

        BucketList bucketList = bucketListService.getBucketListByUser(user);

        destination.setBucketList(bucketList);

        return destinationService.addNewDestination(destination);
    }

    @DeleteMapping("/delete-destination/{id}")
    @PreAuthorize("hasRole('USER')")
    public void deleteDestinationById(@PathVariable("id") long id) {
        destinationService.deleteDestinationById(id);
    }

    @PutMapping("/add-to-visited/{id}")
    @PreAuthorize("hasRole('USER')")
    public void markDestinationAsVisited(@PathVariable("id") long id) {
        System.out.println("MMMMMMMMMMMMM" + id);
        LocalDate visitedUntil = LocalDate.ofEpochDay(2000-11-11);
        String note = "barmi";
//        destinationService.markDestinationAsVisited(id, LocalDate.parse(visitedFrom), visitedUntil, note);
    }

}

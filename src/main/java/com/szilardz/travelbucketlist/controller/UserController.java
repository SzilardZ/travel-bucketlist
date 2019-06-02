package com.szilardz.travelbucketlist.controller;

import com.szilardz.travelbucketlist.model.BucketList;
import com.szilardz.travelbucketlist.model.User;
import com.szilardz.travelbucketlist.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/user")
public class UserController {

    @Autowired
    private UserService userService;

    @Autowired
    private PasswordEncoder encoder;

    private String errorMessage = "User not found with this username!";

    @GetMapping("/{username}/destinations")
    @PreAuthorize("hasRole('USER')")
    public ResponseEntity<BucketList> getBucketListByUserName(@PathVariable("username") String username){
        User user = userService.findByUsername(username)
                .orElseThrow(() -> new UsernameNotFoundException(errorMessage));
        BucketList bucketList = user.getBucketList();

        return ResponseEntity.ok().body(bucketList);
    }

    @PutMapping("/{username}")
    @PreAuthorize("hasRole('USER')")
    public ResponseEntity<Boolean> editUser(@PathVariable("username") String username, @RequestBody User user) {
        User currentUser = userService.findByUsername(username)
                .orElseThrow(() -> new UsernameNotFoundException(errorMessage));

        if(user.getPassword()!=null) currentUser.setPassword(encoder.encode(user.getPassword()));

        currentUser.setFirstName(user.getFirstName());
        currentUser.setLastName(user.getLastName());
        currentUser.setEmail(user.getEmail());

        userService.save(currentUser);

        return ResponseEntity.ok().body(Boolean.TRUE);
    }

    @DeleteMapping("/{username}")
    @PreAuthorize("hasRole('USER')")
    public ResponseEntity<Boolean> deleteUser(@PathVariable("username") String username) {
        User user = userService.findByUsername(username)
                .orElseThrow(() -> new UsernameNotFoundException(errorMessage));

        userService.delete(user);

        return ResponseEntity.ok().body(Boolean.TRUE);
    }
}

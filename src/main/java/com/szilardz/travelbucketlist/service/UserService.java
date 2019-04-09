package com.szilardz.travelbucketlist.service;

import com.szilardz.travelbucketlist.model.User;
import com.szilardz.travelbucketlist.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class UserService {

    @Autowired
    private UserRepository userRepository;

    public void addUser(User user) {
        userRepository.save(user);
    }
}

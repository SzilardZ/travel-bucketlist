package com.szilardz.travelbucketlist.controller;

import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BucketListController {


    @GetMapping("/{name}")
    public String homepage(@PathVariable String name) {
        return "Hi " + StringUtils.capitalize(name) + ", how are you?";
    }


}

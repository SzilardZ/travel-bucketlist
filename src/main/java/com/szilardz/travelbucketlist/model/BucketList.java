package com.szilardz.travelbucketlist.model;

import javax.persistence.Entity;
import java.util.ArrayList;
import java.util.List;

@Entity
public class BucketList {

    private int id;
    private User user;
    private List<Destination> destinationList = new ArrayList<>();

    public BucketList(User user) {
        this.user = user;
    }

    public void addDestination(Destination destination) {
        destinationList.add(destination);
    }

    public int getId() {
        return id;
    }

    public User getUser() {
        return user;
    }
}

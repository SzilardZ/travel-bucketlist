package com.szilardz.travelbucketlist.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "bucket_list")
public class BucketList {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "user")
    private User user;

    @Column(name = "destinations")
    private List<Destination> destinationList = new ArrayList<>();


    public BucketList() {
    }

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

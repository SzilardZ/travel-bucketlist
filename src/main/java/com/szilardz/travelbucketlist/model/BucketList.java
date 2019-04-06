package com.szilardz.travelbucketlist.model;

import javax.persistence.Entity;
import java.util.concurrent.atomic.AtomicInteger;

@Entity
public class BucketList {

    private String location;
    private String note;
    private int id;

    private AtomicInteger nextId = new AtomicInteger();

    public BucketList(String location, String note) {
        this.location = location;
        this.note = note;
        this.id = nextId.incrementAndGet();
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}

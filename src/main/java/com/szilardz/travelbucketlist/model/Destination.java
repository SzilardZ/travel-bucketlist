package com.szilardz.travelbucketlist.model;

import java.util.concurrent.atomic.AtomicInteger;

public class Destination {

    private String location;
    private String note;
    private int id;

    private AtomicInteger nextId = new AtomicInteger();

    public Destination(String location, String note) {
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

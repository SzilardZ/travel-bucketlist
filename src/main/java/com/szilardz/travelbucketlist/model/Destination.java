package com.szilardz.travelbucketlist.model;

public class Destination {

    private int id;
    private String location;
    private String note;
    private BucketList bucketList;

    public Destination(String location, String note, BucketList bucketList) {
        this.location = location;
        this.note = note;
        this.bucketList = bucketList;
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

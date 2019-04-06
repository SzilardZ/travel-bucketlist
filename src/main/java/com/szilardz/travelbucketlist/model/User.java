package com.szilardz.travelbucketlist.model;

import javax.persistence.Entity;
import java.util.concurrent.atomic.AtomicInteger;

@Entity
public class User {

    private int id;
    private String firstName;
    private String lastName;
    private String email;

    private AtomicInteger nextId = new AtomicInteger();

    public User(String firstName, String lastName, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.id = nextId.incrementAndGet();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}

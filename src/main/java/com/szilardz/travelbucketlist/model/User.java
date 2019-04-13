package com.szilardz.travelbucketlist.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;


@Entity
@Table(name="_users")
@Data               //lombok, getters & setters, toString
@NoArgsConstructor  //lombok, constructor with no argument
@AllArgsConstructor //lombok, constructor with all argument
@Builder            //lombok, with that, we can build a new instance
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "email")
    private String email;

}

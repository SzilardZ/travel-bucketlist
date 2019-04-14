package com.szilardz.travelbucketlist.model;

import lombok.*;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "bucket_list")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class BucketList {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long bucketListId;

    private String name;

    @OneToOne
    private User user;

    @OneToMany(mappedBy = "bucketList")
    @Singular
    private Set<Destination> destinations = new HashSet<>();

}

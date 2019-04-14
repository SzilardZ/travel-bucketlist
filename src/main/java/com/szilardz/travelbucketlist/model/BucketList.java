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

    @OneToOne
    private User user;

    @OneToMany(mappedBy = "bucketList", fetch=FetchType.LAZY)
    @Singular
    private Set<Destination> destinations = new HashSet<>();

}

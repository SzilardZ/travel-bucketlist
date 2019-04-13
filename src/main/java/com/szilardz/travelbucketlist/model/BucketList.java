package com.szilardz.travelbucketlist.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "bucket_list")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class BucketList {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "user")
    private User user;

    @Column(name = "destinations")
    private List<Destination> destinationList = new ArrayList<>();

}

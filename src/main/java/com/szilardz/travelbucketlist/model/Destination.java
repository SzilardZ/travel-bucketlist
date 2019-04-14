package com.szilardz.travelbucketlist.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "destination")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Destination {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long destinationId;

    private String location;

    private boolean visited = false;

    private String note;

    @ManyToOne
    private BucketList bucketList;

    private void visitDestination() {
        this.visited = true;
    }

}

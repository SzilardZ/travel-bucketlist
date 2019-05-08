package com.szilardz.travelbucketlist.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;

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

    private LocalDate visitedFrom = null;

    private LocalDate visitedUntil = null;

    private String note;

    @JsonIgnore
    @ManyToOne
    private BucketList bucketList;


}

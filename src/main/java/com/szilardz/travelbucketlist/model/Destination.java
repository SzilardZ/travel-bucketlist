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

    private String note;

    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name = "bucket_list_id")
    private BucketList bucketList;

}

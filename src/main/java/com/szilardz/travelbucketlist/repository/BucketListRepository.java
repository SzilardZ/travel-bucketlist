package com.szilardz.travelbucketlist.repository;

import com.szilardz.travelbucketlist.model.BucketList;
import com.szilardz.travelbucketlist.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BucketListRepository extends JpaRepository<BucketList, Long> {

    BucketList getByBucketListId(Long id);

    BucketList getBucketListByUserId(Long id);

    BucketList getBucketListByUser(User user);


}

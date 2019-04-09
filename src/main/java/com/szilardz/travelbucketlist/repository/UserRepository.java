package com.szilardz.travelbucketlist.repository;

import com.szilardz.travelbucketlist.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    User getById(Long id);
}

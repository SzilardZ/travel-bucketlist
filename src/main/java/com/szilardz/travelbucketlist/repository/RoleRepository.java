package com.szilardz.travelbucketlist.repository;

import com.szilardz.travelbucketlist.model.Role;
import com.szilardz.travelbucketlist.util.RoleName;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
    Optional<Role> findByName(RoleName roleName);
}

package com.szilardz.travelbucketlist.service;

import com.szilardz.travelbucketlist.model.Role;
import com.szilardz.travelbucketlist.repository.RoleRepository;
import com.szilardz.travelbucketlist.util.RoleName;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class RoleService {

    @Autowired
    private RoleRepository roleRepository;

    public Optional<Role> findByName(RoleName roleUser) {
        return roleRepository.findByName(roleUser);
    }

    public void save(Role role) {
        roleRepository.save(role);
    }
}

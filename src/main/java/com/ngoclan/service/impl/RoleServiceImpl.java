package com.ngoclan.service.impl;

import com.ngoclan.entity.RoleEntity;
import com.ngoclan.entity.UserEntity;
import com.ngoclan.repository.RoleRepository;
import com.ngoclan.service.RoleService;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
public class RoleServiceImpl implements RoleService {

    @Autowired
    private RoleRepository roleRepository;
    @Override
    @Transactional(rollbackOn = {Exception.class})
    public RoleEntity save(RoleEntity role) {
        return roleRepository.save(role);
    }

    @Override
    public RoleEntity findOneByCode(String code) {
        return roleRepository.findOneByCode(code).orElseThrow();
    }
}

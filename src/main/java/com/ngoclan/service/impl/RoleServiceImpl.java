package com.ngoclan.service.impl;

import com.ngoclan.entity.RoleEntity;
import com.ngoclan.repository.RoleRepository;
import com.ngoclan.service.IRoleService;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RoleServiceImpl implements IRoleService {

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

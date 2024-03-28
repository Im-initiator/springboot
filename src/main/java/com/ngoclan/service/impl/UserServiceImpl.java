package com.ngoclan.service.impl;


import com.ngoclan.entity.RoleEntity;
import com.ngoclan.entity.UserEntity;
import com.ngoclan.repository.RoleRepository;
import com.ngoclan.repository.UserRepository;
import com.ngoclan.service.IRoleService;
import com.ngoclan.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class UserServiceImpl implements IUserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private IRoleService roleService;

    @Autowired
    private RoleRepository roleRepository;

    @Override
    public UserEntity save(UserEntity userEntity) {
        RoleEntity role = roleService.findOneByCode("USER");
        Set<RoleEntity> roles = userEntity.getRoles();
        roles.add(role);
        userEntity =  userRepository.save(userEntity);
        return userEntity;
    }
}

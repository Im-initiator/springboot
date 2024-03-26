package com.ngoclan.service.impl;


import com.ngoclan.entity.RoleEntity;
import com.ngoclan.entity.UserEntity;
import com.ngoclan.repository.UserRepository;
import com.ngoclan.service.RoleService;
import com.ngoclan.service.UserService;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private RoleService roleService;
    @Override
   // @Transactional(rollbackOn = {Exception.class})
    public UserEntity save(UserEntity userEntity) {
        RoleEntity role = roleService.findOneByCode("USER");
        Set<RoleEntity> roles = userEntity.getRoles();
        roles.add(role);
        userEntity =  userRepository.save(userEntity);
//        UserEntity user = userRepository.findOneById(2L);
        return null;
    }
}

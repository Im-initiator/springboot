package com.ngoclan.service;

import com.ngoclan.entity.RoleEntity;

public interface IRoleService {
    RoleEntity save(RoleEntity role);

    RoleEntity findOneByCode(String code);
}

package com.ngoclan.service;

import com.ngoclan.entity.RoleEntity;
import org.springframework.data.jpa.repository.EntityGraph;

public interface RoleService {
    RoleEntity save(RoleEntity role);

    RoleEntity findOneByCode(String code);
}

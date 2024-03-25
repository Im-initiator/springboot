package com.ngoclan.repository;

import com.ngoclan.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserEntity,Long> {
    UserEntity findOneById(Long id);
}

package com.ngoclan.repository;

import com.ngoclan.entity.RoleEntity;
import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface RoleRepository extends JpaRepository<RoleEntity,Long> {
    @EntityGraph(attributePaths = {"users"},type = EntityGraph.EntityGraphType.LOAD )
    Optional<RoleEntity> findOneByCode(String code);
}

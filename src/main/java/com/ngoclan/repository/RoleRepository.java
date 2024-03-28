package com.ngoclan.repository;

import com.ngoclan.entity.ProductEntity;
import com.ngoclan.entity.RoleEntity;
import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;
import java.util.Set;


public interface RoleRepository extends JpaRepository<RoleEntity,Long> {
    //@EntityGraph(attributePaths = {"users"},type = EntityGraph.EntityGraphType.LOAD )
    Optional<RoleEntity> findOneByCode(String code);


    //@Query("")
    @EntityGraph(attributePaths = {"users"})
    @Query("SELECT r FROM RoleEntity r LEFT JOIN FETCH r.users")
    Set<RoleEntity> findMyWithCode(String code);
}

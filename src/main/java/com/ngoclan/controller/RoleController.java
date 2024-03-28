package com.ngoclan.controller;

import com.ngoclan.entity.RoleEntity;
import com.ngoclan.repository.ProductRepository;
import com.ngoclan.repository.RoleRepository;
import com.ngoclan.repository.UserRepository;
import com.ngoclan.service.IRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/role")
public class RoleController {

    @Autowired
    private IRoleService roleService;

    @Autowired
    private RoleRepository roleRepository;

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private ProductRepository productRepository;

    @PostMapping
    public ResponseEntity<RoleEntity> save(@RequestBody RoleEntity role){
        return ResponseEntity.ok(roleService.save(role));
    }
}

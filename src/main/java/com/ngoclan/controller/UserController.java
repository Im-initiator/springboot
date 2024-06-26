package com.ngoclan.controller;

import com.ngoclan.entity.UserEntity;
import com.ngoclan.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private IUserService userService;

    @PostMapping()
    public ResponseEntity<?> save(@RequestBody UserEntity user){
        UserEntity userEntity = userService.save(user);
        return ResponseEntity.ok(userEntity);
    }
}

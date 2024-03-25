package com.ngoclan.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomeController {
    @RequestMapping(value = "/home/test",method = RequestMethod.GET)
    public ResponseEntity<String> home(){
        System.out.println(SecurityContextHolder.getContext());
        return ResponseEntity.ok("ok");

    }
    @RequestMapping(value = "/authentication",method = RequestMethod.GET)
    public ResponseEntity<String> authentication(){
        return ResponseEntity.ok("ok");
    }

    @RequestMapping(value = "/login",method = RequestMethod.GET)
    public String login(){
        System.out.println(SecurityContextHolder.getContext());
        return "login";
    }
}

package com.ngoclan.config;

import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.web.SecurityFilterChain;
@Configuration
@EnableWebSecurity
public class SecurityConfig {


    @Autowired
    private  AuthenticationProvider authenticationProvider;


    @PostConstruct
    public void init(){
        System.out.println("init config");
    }

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception{
        http
                .authorizeHttpRequests(config ->
                        config
                               // .requestMatchers("/home/test","/login")
                                .requestMatchers("/**")
                                .permitAll()
//                                .anyRequest()
//                                .authenticated()
                )
                .csrf().disable()
                .httpBasic().disable()
                .formLogin(form ->
                        form
                                .loginPage("/login")
                                .permitAll()
                );
        return http.build();
    }

}

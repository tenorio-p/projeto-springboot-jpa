package com.projeto_tenorio.projeto_spring.resources;


import com.projeto_tenorio.projeto_spring.entities.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserResource {

    @GetMapping
    public ResponseEntity<User> finAllUsers() {
        User user = new User(1L, "Peter", "peter@gmail.com", "999999907", "122112");
        return ResponseEntity.ok().body(user);
    }

}

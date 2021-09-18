package com.marcosjcs.loja.resources;

import com.marcosjcs.loja.entities.User;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/users")
public class UserResource {
  
  @GetMapping
  public ResponseEntity<User> findAll() {
    User u = new User(1L,"Marcos","jcs@gmail.com","485435809438","12312");
    return ResponseEntity.ok().body(u);
  }
  
}

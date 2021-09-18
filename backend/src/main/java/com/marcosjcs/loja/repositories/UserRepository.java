package com.marcosjcs.loja.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.marcosjcs.loja.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
  
}
package com.marcosjcs.loja.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.marcosjcs.loja.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {
  
}

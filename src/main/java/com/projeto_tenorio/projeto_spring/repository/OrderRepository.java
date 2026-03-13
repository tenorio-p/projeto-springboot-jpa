package com.projeto_tenorio.projeto_spring.repository;

import com.projeto_tenorio.projeto_spring.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long> {


}

package com.projeto_tenorio.projeto_spring.repository;

import com.projeto_tenorio.projeto_spring.entities.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {


}

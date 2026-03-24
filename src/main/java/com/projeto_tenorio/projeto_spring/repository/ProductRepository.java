package com.projeto_tenorio.projeto_spring.repository;

import com.projeto_tenorio.projeto_spring.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {


}

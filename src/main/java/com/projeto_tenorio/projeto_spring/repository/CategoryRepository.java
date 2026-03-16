package com.projeto_tenorio.projeto_spring.repository;

import com.projeto_tenorio.projeto_spring.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {


}

package com.projeto_tenorio.projeto_spring.repository;

import com.projeto_tenorio.projeto_spring.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {


}

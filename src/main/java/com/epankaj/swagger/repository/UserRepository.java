package com.epankaj.swagger.repository;


import com.epankaj.swagger.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
}

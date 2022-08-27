package com.microservices.example.userservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.microservices.example.userservice.entity.UserTable;

@Repository
public interface UserRepository extends JpaRepository<UserTable, Long>{

	UserTable findByUserId(Long userId);

}

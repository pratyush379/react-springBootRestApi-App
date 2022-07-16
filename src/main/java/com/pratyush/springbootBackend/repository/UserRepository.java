package com.pratyush.springbootBackend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pratyush.springbootBackend.model.User;

public interface UserRepository extends JpaRepository<User,Long>{

}

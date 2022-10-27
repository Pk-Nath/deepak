package com.deepak.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.deepak.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {

}

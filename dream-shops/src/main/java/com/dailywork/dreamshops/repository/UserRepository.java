package com.dailywork.dreamshops.repository;

import  org.springframework.data.jpa.repository.JpaRepository;

import com.dailywork.dreamshops.model.User;

public interface UserRepository extends JpaRepository<User, Long> {

	boolean existsByEmail(String email);

		User findByEmail(String email);

}

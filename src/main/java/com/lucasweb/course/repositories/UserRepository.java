package com.lucasweb.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lucasweb.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{
	
}

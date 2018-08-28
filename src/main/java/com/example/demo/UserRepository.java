package com.example.demo;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserModel, Integer> {
	public UserModel findByEmail(String Email);
	public UserModel findByUsername(String username);
}

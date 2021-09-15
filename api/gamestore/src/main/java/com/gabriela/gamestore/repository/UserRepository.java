package com.gabriela.gamestore.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gabriela.gamestore.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
	
	public List<User> findAllByNameContainingIgnoreCase(String name);
	
	public Optional<User> findByEmail(String email);
	
	public User findByName(String name);

}

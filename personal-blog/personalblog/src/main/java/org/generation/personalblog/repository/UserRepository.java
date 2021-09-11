package org.generation.personalblog.repository;

import java.util.List;
import java.util.Optional;

import org.generation.personalblog.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

	public List<User> findAllByNameContainingIgnoreCase(String name);
	
	public Optional<User> findByEmail(String email);
	
	public User findByName(String name);
}

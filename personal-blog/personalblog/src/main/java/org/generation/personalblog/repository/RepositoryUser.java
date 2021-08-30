package org.generation.personalblog.repository;

import java.util.List;
import java.util.Optional;

import org.generation.personalblog.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositoryUser extends JpaRepository<User, Long> {

	public List<User> findAllByNameContainingIgnoreCase(String name);
	
	Optional<User> findByEmail (String email);
}

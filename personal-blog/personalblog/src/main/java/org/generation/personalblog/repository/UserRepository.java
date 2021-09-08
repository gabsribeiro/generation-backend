package org.generation.personalblog.repository;

import java.util.List;
import java.util.Optional;

import org.generation.personalblog.model.UserModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<UserModel, Long> {

	public List<UserModel> findAllByNameContainingIgnoreCase(String name);
	
	Optional<UserModel> findByEmail(String email);
}

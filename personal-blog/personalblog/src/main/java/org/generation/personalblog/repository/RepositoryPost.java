package org.generation.personalblog.repository;

import java.util.List;

import org.generation.personalblog.model.Post;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositoryPost extends JpaRepository<Post, Long> {

	public List<Post> findAllByTitleContainingIgnoreCase(String title);

}

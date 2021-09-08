package org.generation.personalblog.security;

import java.util.Optional;

import org.generation.personalblog.model.UserModel;
import org.generation.personalblog.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

public class UserDetailsServiceImplements implements UserDetailsService {

	@Autowired
	private UserRepository repository;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		Optional<UserModel> user = repository.findByEmail(username);
		if (user.isPresent()) {
			return new UserDetailsImplements(user.get());
		} else {
			throw new UsernameNotFoundException(username + " Not Found");
		}
	}

}

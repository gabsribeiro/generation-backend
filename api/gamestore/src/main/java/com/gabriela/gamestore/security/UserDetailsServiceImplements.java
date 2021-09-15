package com.gabriela.gamestore.security;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.gabriela.gamestore.model.User;
import com.gabriela.gamestore.repository.UserRepository;

@Service
public class UserDetailsServiceImplements implements UserDetailsService {

	@Autowired
	private UserRepository repository;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		Optional<User> user = repository.findByEmail(username);
		if (user.isPresent()) {
			return new UserDetailsImplements(user.get());
		} else {
			throw new UsernameNotFoundException(username + "Not Found");
		}
	}

}

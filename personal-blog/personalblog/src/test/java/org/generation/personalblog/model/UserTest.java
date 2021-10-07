package org.generation.personalblog.model;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;

@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
public class UserTest {

	public User user;
	public User nullUser = new User();

	@Autowired
	private ValidatorFactory factory = Validation.buildDefaultValidatorFactory();

	Validator validator = factory.getValidator();

	@BeforeEach
	public void start() {
		user = new User(0L, "Gabriela Ribeiro", "gabriela@email.com", "12345678", "", "");
	}

	@Test
	void testValidator() {
		Set<ConstraintViolation<User>> violation = validator.validate(user);

		System.out.println(violation.toString());

		assertTrue(violation.isEmpty());
	}

	@Test
	void testNotValidator() {
		Set<ConstraintViolation<User>> violation = validator.validate(nullUser);

		System.out.println(violation.toString());

		assertFalse(violation.isEmpty());
	}

	@AfterAll
	public void end() {
		System.out.println("Teste finalizado!");
	}

}

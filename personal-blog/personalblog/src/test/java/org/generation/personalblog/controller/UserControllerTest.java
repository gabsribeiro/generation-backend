package org.generation.personalblog.controller;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.generation.personalblog.model.User;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestMethodOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class UserControllerTest {

	@Autowired
	private TestRestTemplate testRestTemplate;

	private User userToAdd;
	private User userToUpdate;

	@BeforeAll
	void start() {
		userToAdd = new User(0L, "Bárbara Cristiane", "barbara@email.com", "12345678", "", "");

		userToUpdate = new User(1L, "Gabriela Ribeiro", "gabriela@email.com", "harry1234", "", "");
	}

	@Test
	@DisplayName("Cadastra novo usuário")
	@Order(1)
	void toRegisterNewUser() {
		HttpEntity<User> request = new HttpEntity<User>(userToAdd);
		ResponseEntity<User> response = testRestTemplate.exchange("/api/user/register", HttpMethod.POST, request,
				User.class);
		assertEquals(HttpStatus.CREATED, response.getStatusCode());
	}

	@Test
	@DisplayName("Lista todos os usuários")
	@Order(2)
	void toListAllUsers() {
		ResponseEntity<String> response = testRestTemplate.withBasicAuth("barbara@email.com", "12345678")
				.exchange("/api/user/all", HttpMethod.GET, null, String.class);
		assertEquals(HttpStatus.OK, response.getStatusCode());

	}

	@Test
	@DisplayName("Atualiza um usuário existente")
	@Order(3)
	void toUpdateExistingUser() {
		HttpEntity<User> request = new HttpEntity<User>(userToUpdate);
		ResponseEntity<User> response = testRestTemplate.withBasicAuth("barbara@email.com", "12345678")
				.exchange("/api/user/update", HttpMethod.PUT, request, User.class);
		assertEquals(HttpStatus.CREATED, response.getStatusCode());
	}

	@AfterAll
	public void end() {
		System.out.println("Teste finalizado!");
	}

}

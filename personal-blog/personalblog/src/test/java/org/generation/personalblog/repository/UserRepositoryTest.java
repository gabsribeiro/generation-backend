package org.generation.personalblog.repository;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;

import org.generation.personalblog.model.User;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;

@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class UserRepositoryTest {

	@Autowired
	private UserRepository repository;

	@BeforeAll
	void start() {
		LocalDate date = LocalDate.parse("1993-11-07", DateTimeFormatter.ofPattern("yyyy-MM-dd"));
		User user = new User(0L, "Gabriela de Santana Ribeiro", "gabriela@email.com", "12345678", date);
		if (!repository.findByEmail(user.getEmail()).isPresent())
			repository.save(user);

		date = LocalDate.parse("2000-11-30", DateTimeFormatter.ofPattern("yyyy-MM-dd"));
		user = new User(0L, "Giovanna Santana Ribeiro", "giovanna@email.com", "12345678", date);
		if (!repository.findByEmail(user.getEmail()).isPresent())
			repository.save(user);

		date = LocalDate.parse("1969-03-12", DateTimeFormatter.ofPattern("yyyy-MM-dd"));
		user = new User(0L, "Damiana Santana", "damiana@email.com", "12345678", date);
		if (!repository.findByEmail(user.getEmail()).isPresent())
			repository.save(user);
	}

	@Test
	@DisplayName("✉ Retorna e-mail")
	public void findByReturnEmail() {
		User objectUser = repository.findByEmail("gabriela@email.com").get();

		assertTrue(objectUser.getEmail().equals("gabriela@email.com"));
	}

	@Test
	@DisplayName("💾 Retorna nome")
	public void findByReturnName() {
		User objectUser = repository.findByName("Giovanna Santana Ribeiro");

		assertTrue(objectUser.getName().equals("Giovanna Santana Ribeiro"));
	}

	@Test
	@DisplayName("👥 Retorna lista de usuários")
	public void findAllByNameContainingIgnoreCaseReturnListUsers() {
		List<User> userList = repository.findAllByNameContainingIgnoreCase("Santana");
		assertEquals(3, userList.size());
	}

	@AfterAll
	public void end() {
		System.out.println("Teste finalizado!");
	}

}

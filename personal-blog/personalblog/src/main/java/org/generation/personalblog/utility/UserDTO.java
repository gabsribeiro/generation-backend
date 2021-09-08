package org.generation.personalblog.utility;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserDTO {

	private Long id;

	private String name;

	@NotBlank(message = "Insira um e-mail")
	@Email(message = "Insira um e-mail")
	private String email;

	@Size(min = 5, max = 100, message = "Minímo de 5 caracteres")
	private String password;

	private String token;

}

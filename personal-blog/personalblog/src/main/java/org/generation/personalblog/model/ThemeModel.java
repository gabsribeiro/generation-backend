package org.generation.personalblog.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "tb_table")
public class ThemeModel {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idTheme;

	@NotBlank
	private String theme;

	@OneToMany(mappedBy = "relatedTheme", cascade = CascadeType.REMOVE)
	@JsonIgnoreProperties({ "relatedTheme" })
	private List<PostModel> themePosts = new ArrayList<>();

}

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

	public Long getIdTheme() {
		return idTheme;
	}

	public void setIdTheme(Long idTheme) {
		this.idTheme = idTheme;
	}

	public String getTheme() {
		return theme;
	}

	public void setTheme(String theme) {
		this.theme = theme;
	}

	public List<PostModel> getThemePosts() {
		return themePosts;
	}

	public void setThemePosts(List<PostModel> themePosts) {
		this.themePosts = themePosts;
	}

}

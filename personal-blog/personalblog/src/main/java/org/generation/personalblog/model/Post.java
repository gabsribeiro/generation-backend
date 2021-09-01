package org.generation.personalblog.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "tb_post")
public class Post {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idPost;

	@NotBlank
	private String title;

	@NotBlank
	private String text;

	@ManyToOne
	@JoinColumn(name = "user_id")
	@JsonIgnoreProperties({ "userPosts" })
	private User user;

	@ManyToOne
	@JoinColumn(name = "theme_id")
	@JsonIgnoreProperties({ "themePosts" })
	private Theme relatedTheme;

	public Long getIdPost() {
		return idPost;
	}

	public void setIdPost(Long idPost) {
		this.idPost = idPost;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Theme getRelatedTheme() {
		return relatedTheme;
	}

	public void setRelatedTheme(Theme relatedTheme) {
		this.relatedTheme = relatedTheme;
	}

}

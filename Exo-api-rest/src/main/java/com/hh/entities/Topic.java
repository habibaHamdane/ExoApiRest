package com.hh.entities;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;


import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Topic implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	public Integer id;
	public String title;
	
	@JsonIgnore
	@OneToMany(mappedBy = "topic", fetch = FetchType.LAZY)
	public Collection<Post> listPosts;
	
	public Topic() {
		super();
	}
	public Topic(String title) {
		super();
		this.title = title;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public Collection<Post> getPosts() {
		return listPosts;
	}
	public void setPosts(Collection<Post> listPosts) {
		this.listPosts = listPosts;
	}

}

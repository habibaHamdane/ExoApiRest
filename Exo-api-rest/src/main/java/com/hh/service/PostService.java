package com.hh.service;

import java.util.List;

import com.hh.entities.Post;

public interface PostService {

	public Post createPost(Post p);
	public Post readPost(Integer id);
	public void updatePost(Post p);
	public void deletePost(Integer id);
	public List<Post> listPosts();
}

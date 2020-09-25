package com.hh.Dao;

import java.util.List;

import com.hh.entities.Post;

public interface PostRepository {

	
	  public Post createPost(Post p); 
	  public Post readPost(Integer id); 
	  public void updatePost(Post p); 
	  public void deletePost(Integer id);
	  public List<Post> listPosts();
	 
}

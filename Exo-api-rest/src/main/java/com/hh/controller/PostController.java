package com.hh.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.hh.entities.Post;
import com.hh.service.PostService;

@RestController
@RequestMapping("posts")
public class PostController {
	@Autowired
	private PostService postService;
	
	@RequestMapping(value = "/create", method = RequestMethod.POST)
	public Post savePost(@RequestBody Post p) {
		Post newPost = postService.createPost(p);
		return newPost;
	}

	@RequestMapping(value = "/read/{id}", method = RequestMethod.GET)
	public Post getPost(@PathVariable Integer id) {
		return postService.readPost(id);
	}
	
	@RequestMapping(value = "/update", method = RequestMethod.PUT)
	public void updatePost(@RequestBody Post p) {
		postService.updatePost(p);
	}

	@RequestMapping(value = "/delete/{id}", method = RequestMethod.DELETE)
	public void deletePost(@PathVariable Integer id) {
		postService.deletePost(id);
	}
	
	@RequestMapping(value = "/listPosts", method = RequestMethod.GET)
	public List<Post> listPosts(){
		return postService.listPosts();
	}
	
}

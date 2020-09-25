package com.hh.serviceImp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hh.Dao.PostRepository;
import com.hh.entities.Post;
import com.hh.service.PostService;

@Service
public class PostServiceImp implements PostService {

	@Autowired
	private PostRepository postRepository;
	
	@Override
	public Post createPost(Post p) {
		return postRepository.createPost(p) ;
	}

	@Override
	public Post readPost(Integer id) {
		return postRepository.readPost(id);
	}

	@Override
	public void updatePost(Post p) {
		postRepository.updatePost(p);
	}

	@Override
	public void deletePost(Integer id) {
		postRepository.deletePost(id);
	}

	@Override
	public List<Post> listPosts() {
		return postRepository.listPosts();
	}

}

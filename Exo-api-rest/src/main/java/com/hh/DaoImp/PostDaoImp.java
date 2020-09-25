package com.hh.DaoImp;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.hh.Dao.PostRepository;
import com.hh.entities.Post;

@Repository("postrepository")
@Transactional
public class PostDaoImp implements PostRepository {

	@PersistenceContext
	private EntityManager em;
	
	@Override
	public Post createPost(Post p) {
		em.persist(p);
		return p;
	}

	@Override
	public Post readPost(Integer id) {
		return (Post) em.find(Post.class, id);
	}

	@Override
	public void updatePost(Post p) {
		em.merge (p);

	}

	@Override
	public void deletePost(Integer id) {
		em.remove(readPost(id));

	}

	@Override
	public List<Post> listPosts() {
		return em.createQuery("From Post").getResultList();
	}

}

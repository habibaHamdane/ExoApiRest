package com.hh.DaoImp;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.hh.Dao.TopicRepository;
import com.hh.entities.Topic;

@Repository
@Transactional
public class TopicDaoImpl implements TopicRepository {

	@PersistenceContext
	private EntityManager em;

	@Override
	public Topic createTopic(Topic t) {
		em.persist(t);
		return t;
	}

	@Override
	public Topic readTopic(Integer id) {
		return (Topic) em.find(Topic.class, id);
		
	}

	@Override
	public void updateTopic(Topic t) {
		em.merge (t);

	}

	@Override
	public void deleteTopic(Integer id) {
		em.remove(readTopic(id));

	}
}

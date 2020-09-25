package com.hh.serviceImp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hh.Dao.TopicRepository;
import com.hh.entities.Topic;
import com.hh.service.TopicService;
@Service
public class TopicServiceImp implements TopicService {

	@Autowired
	private TopicRepository topicRepository;
	@Override
	public Topic createTopic(Topic t) {
		// TODO Auto-generated method stub
		return topicRepository.createTopic(t);
	}

	@Override
	public Topic readTopic(Integer id) {
		// TODO Auto-generated method stub
		return topicRepository.readTopic(id);
	}

	@Override
	public void updateTopic(Topic t) {
		// TODO Auto-generated method stub
		topicRepository.updateTopic(t);
	}

	@Override
	public void deleteTopic(Integer id) {
		// TODO Auto-generated method stub
		topicRepository.deleteTopic(id);
	}

}

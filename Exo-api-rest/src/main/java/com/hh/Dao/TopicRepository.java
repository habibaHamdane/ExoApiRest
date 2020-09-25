package com.hh.Dao;

import com.hh.entities.Topic;

public interface TopicRepository {

	
	  public Topic createTopic(Topic t); 
	  public Topic readTopic(Integer id); 
	  public void updateTopic(Topic t); 
	  public void deleteTopic(Integer id);
	 
}

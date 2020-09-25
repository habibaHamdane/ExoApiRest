package com.hh.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.hh.entities.Topic;
import com.hh.service.TopicService;

@RestController
@RequestMapping("topics")
public class TopicController {
	
	@Autowired
	private TopicService topicService;

	@RequestMapping(value = "/create", method = RequestMethod.POST)
	public Topic createTopic(@RequestBody Topic t) {
		return topicService.createTopic(t);
	}

	@RequestMapping(value = "/read/{id}", method = RequestMethod.GET)
	public Topic readTopic(@PathVariable Integer id) {
		return topicService.readTopic(id);
	}

	@RequestMapping(value = "/update", method = RequestMethod.PUT)
	public void updateTopic(@RequestBody Topic t) {
		topicService.updateTopic(t);
	}

	@RequestMapping(value = "/delete/{id}", method = RequestMethod.DELETE)
	public void deleteTopic(@PathVariable Integer id) {
		topicService.deleteTopic(id);
	}
	
	
}

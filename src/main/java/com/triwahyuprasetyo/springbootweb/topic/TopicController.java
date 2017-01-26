package com.triwahyuprasetyo.springbootweb.topic;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TopicController {

	@RequestMapping("/topics")
	public List<Topic> getAllTopics() {
		return Arrays.asList(new Topic("id1", "Health", "Health description"),
				new Topic("id2", "Sport", "Sport description"), new Topic("id3", "Social", "Social description"));
	}
}

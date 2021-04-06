package com.example.springhomework1.homework.services;

import com.example.springhomework1.homework.models.Topic;
import com.example.springhomework1.homework.repositories.TopicRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TopicsList {

    @Autowired
    private TopicRepository topicRepository;

    public List<Topic> getTopicList() {
        return topicRepository.findAll();
    }


}

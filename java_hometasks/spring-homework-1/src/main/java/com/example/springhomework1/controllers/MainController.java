package com.example.springhomework1.controllers;

import com.example.springhomework1.models.Topic;
import com.example.springhomework1.components.TopicsList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

@RestController
public class MainController {

    @Autowired
    TopicsList TopicsList;

    @GetMapping("/topic")
    public List<Topic> getTopics(){
        return TopicsList.getTopicList();
    }

    @GetMapping("/topic/name/{name}")
    public Topic getTopic(@PathVariable("name") String name){
        List<Topic> foundedTopics = TopicsList
                .getTopicList()
                .stream()
                .filter(topic -> topic.getName().equals(name))
                .collect(Collectors.toList());
        if(foundedTopics.size() == 0) return null;
        return foundedTopics.get(0);
    }

    @GetMapping("/topic/theme/{theme}")
    public List<Topic> getTopicsFilteredByTheme(@PathVariable("theme") String theme){
        List<Topic> foundedTopics = TopicsList
                .getTopicList()
                .stream()
                .filter(topic -> topic.getTheme().equals(theme))
                .collect(Collectors.toList());
        if(foundedTopics.size() == 0) return null;
        return foundedTopics;
    }

    @GetMapping("/topic/order")
    public List<Topic> getOrderedTopics(@RequestParam Boolean order){
        if (order){
            return TopicsList
                    .getTopicList()
                    .stream()
                    .sorted(Comparator.comparing(Topic::getDate))
                    .collect(Collectors.toList());
        }
        return TopicsList.getTopicList();
    }
}

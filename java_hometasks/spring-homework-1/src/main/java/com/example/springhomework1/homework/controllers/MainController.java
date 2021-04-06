package com.example.springhomework1.homework.controllers;

import com.example.springhomework1.homework.Greeting;
import com.example.springhomework1.homework.models.Topic;
import com.example.springhomework1.homework.repositories.TopicRepository;
import com.example.springhomework1.homework.services.TopicsList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

@RestController
public class MainController {

    @Autowired
    TopicsList TopicsList;

    @Autowired
    private TopicRepository topicRepository;

    @Autowired
    Greeting greeting;

    @GetMapping("/hello")
    public String hello() {
        return greeting.sayHello();
    }

    @GetMapping("/topic")
    public List<Topic> getTopics() {
        return TopicsList.getTopicList();
    }

    @PostMapping("/saveTopic")
    public void saveTopic(@RequestBody() Topic topic) {
        topicRepository.save(topic);
    }

    @GetMapping("/topic/name/{name}")
    public Topic getTopic(@PathVariable("name") String name) {
        return topicRepository.getTopicByName(name);
    }

    @GetMapping("/topic/theme/{theme}")
    public List<Topic> getTopicsFilteredByTheme(@PathVariable("theme") String theme) {
        return topicRepository.getTopicsByTheme(theme);
    }

    @GetMapping("/topic/order")
    public List<Topic> getOrderedTopics(@RequestParam Boolean order) {
        if (order) {
            return TopicsList
                    .getTopicList()
                    .stream()
                    .sorted(Comparator.comparing(Topic::getDate))
                    .collect(Collectors.toList());
        }
        return TopicsList.getTopicList();
    }
}

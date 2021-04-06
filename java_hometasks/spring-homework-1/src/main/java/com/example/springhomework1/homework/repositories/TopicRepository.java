package com.example.springhomework1.homework.repositories;

import com.example.springhomework1.homework.models.Topic;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TopicRepository extends JpaRepository<Topic, Long> {
    Topic getTopicByName(String name);

    List<Topic> getTopicsByTheme(String theme);
}

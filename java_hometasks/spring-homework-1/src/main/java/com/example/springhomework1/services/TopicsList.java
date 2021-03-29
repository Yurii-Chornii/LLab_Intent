package com.example.springhomework1.services;

import com.example.springhomework1.models.Topic;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class TopicsList {

    public List<Topic> getTopicList(){
        List<Topic> topics = new ArrayList<>();

        topics.add(new Topic(
                1L,
                "Rockets by SpaceX",
                "space",
                new Date(new Date().getTime() - 125000)
        ));

        topics.add(new Topic(
                2L,
                "The Tesla Model X 2020",
                "Tesla",
                new Date(new Date().getTime() - 210000)
        ));

        topics.add(new Topic(
                3L,
                "Tesla solaris roof",
                "energy",
                new Date(new Date().getTime() - 13000)
        ));

        topics.add(new Topic(
                4L,
                "Tesla Model 3",
                "Tesla",
                new Date(new Date().getTime() - 515000)
        ));

        topics.add(new Topic(
                5L,
                "Building new HyperLoop",
                "HyperLoop",
                new Date(new Date().getTime() - 911000)
        ));

        topics.add(new Topic(
                6L,
                "Tesla Model S 2021 new changes",
                "Tesla",
                new Date(new Date().getTime() - 328000)
        ));

        topics.add(new Topic(
                7L,
                "Interview with Elon Musk",
                "interviews",
                new Date(new Date().getTime() - 1021000)
        ));

        topics.add(new Topic(
                8L,
                "FalconHeavy",
                "space",
                new Date(new Date().getTime() - 205000)
        ));

        topics.add(new Topic(
                9L,
                "Interview by Yuriy Dude",
                "interviews",
                new Date(new Date().getTime() - 1524000)
        ));

        return topics;
    }
}

package com.example.demo.demoController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@Service
public class TopicServices {

    @Autowired
    RepositoryLayer repositoryLayer;

    public List<Topic> topics = new ArrayList<> (Arrays.asList(
            new Topic("Java", "The Java Spring Boot Course"),
            new Topic("Javascript", "The complete Javascript Course"),
            new Topic("Python", "Python for data science")
    ));

    //find all
    public List<Topic> getTopics(){
        return repositoryLayer.findAll();
    }

    //find by id
    public Optional<Topic> getTopic(String id){
        return repositoryLayer.findById(id);
    }

    //create
    public void addTopic(Topic topic) {
        repositoryLayer.save(topic);
    }


    //update topic
    public void updateTopic(String id, Topic topic){
        for(int i=0; i<topics.size(); i++){
            Topic t = topics.get(i);

            if(t.getId().equals(id)){
                repositoryLayer.save(topic);
                //topics.set(i, topic);
                break;
            }
        }
    }

    //Delete
    public void deleteTopic(String id) {
        for(int i=0; i<topics.size(); i++){
            Topic t = topics.get(i);

            if(t.getId().equals(id)){
                //topics.remove(i);
                repositoryLayer.deleteById(id);
                break;
            }
        }
    }
}

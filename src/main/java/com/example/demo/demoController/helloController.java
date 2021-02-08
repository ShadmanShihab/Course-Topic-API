package com.example.demo.demoController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class helloController {

    @Autowired
    public TopicServices topicServices;

    @Autowired
    public UserServices userServices;

    @RequestMapping("/")
    public String home(){
        return "Welcome to the landing page ";
    }

    @RequestMapping("/users")
    public List<User> allUsers(){
        return userServices.getUsers();
    }

    @RequestMapping("/users/login")
    public String login(){
        return "<h1> Welcome to the login page </h1>";
    }

    //find all
    @RequestMapping("/topics")
    public List<Topic> topics(){
        return topicServices.getTopics();
    }

    //find by id
    @RequestMapping("/topics/{id}")
    public Optional<Topic> topic(@PathVariable String id){
        return  topicServices.getTopic(id);
    }


    //making a post request - adding items
    @RequestMapping(method = RequestMethod.POST, value = "/topics")
    public String addTopic(@RequestBody Topic topic){
        topicServices.addTopic(topic);
        return "New Topic Added";
    }


    //update - Making a PUT request
    @RequestMapping(method = RequestMethod.PUT, value = "/topics/{id}")
    public String updateTopic(@RequestBody Topic topic, @PathVariable String id){
        topicServices.updateTopic(id, topic);
        return "Topic Updated";
    }



    //Delete - Mking a delete request
    @RequestMapping(method = RequestMethod.DELETE, value = "/topics/{id}")
    public String deleteTopic(@PathVariable String id){
        topicServices.deleteTopic(id);
        String str = id + "is deleted";
        return str;
    }




}

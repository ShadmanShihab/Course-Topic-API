package com.example.demo.demoController;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositoryLayer extends MongoRepository<Topic, String> {

}

package com.mongo.demomongo.model.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.mongo.demomongo.model.entity.Message;

public interface MessageRepository extends MongoRepository<Message, String>{
    
}

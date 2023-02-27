package com.mongo.demomongo.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.mongo.demomongo.model.entity.Message;
import com.mongo.demomongo.model.repository.MessageRepository;

import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
@RequestMapping("/api")
public class Controller {
    private final Logger logger = LoggerFactory.getLogger(Controller.class);

    @Autowired
    private MessageRepository messageRepository;

    @RequestMapping(value = "", method = RequestMethod.GET)
    public List<Message> getAllUsers() {
        logger.info("Getting all users.");
        List <Message> messages = messageRepository.findAll();
        log.info("messages: {}", messages);
        return messageRepository.findAll();
    }

}

package com.epankaj.swagger.service;

import com.epankaj.swagger.entity.User;
import com.epankaj.swagger.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.logging.Logger;

@Service
public class UserService {

    public static final Logger logger = Logger.getLogger(UserService.class.getName());

    @Autowired
    UserRepository userRepository;

    public User createUser(User user) {
        //User u1 = new User("Pankaj", "Kumar", "pankajsoe44@gmail.com");
        logger.info("User created successfully User : "+user);
        return userRepository.save(user);
    }

    public Optional<User> getUserById(Integer id) {
        logger.info("User found id : "+id);
        return userRepository.findById(id);
    }

    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    // delete user by id
    public void deleteUserById(Integer id) {
        userRepository.deleteById(id);
    }

    //delete all users
    public void deleteAllUsers() {
        userRepository.deleteAll();
    }
}

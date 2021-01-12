package com.sda.SchedulerApp.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sda.SchedulerApp.model.User;
import com.sda.SchedulerApp.repository.UserRepository;

@Service
@Transactional
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public List<User> findAll() {
        return userRepository.findAll();
    }
    
    public User findById(Integer idUser) {
        return userRepository.findById(idUser).get();
    }

    public void save(User user) {
        userRepository.save(user);
    }

    public void delete(User user) {
        userRepository.delete(user);
    }

}

package com.sda.SchedulerApp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sda.SchedulerApp.model.User;

public interface UserRepository extends JpaRepository<User, Integer> {

}

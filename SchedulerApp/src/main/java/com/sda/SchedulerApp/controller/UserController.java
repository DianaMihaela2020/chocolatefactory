package com.sda.SchedulerApp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.sda.SchedulerApp.model.User;
import com.sda.SchedulerApp.service.UserService;

@Controller
@RequestMapping("/users")
public class UserController {
    
    @Autowired
    private UserService userService;
    
    @GetMapping
    public String listUsers(ModelMap modelMap) {
        System.out.println("Listing users");
        
        modelMap.addAttribute("userList", userService.findAll());
        modelMap.addAttribute("newUser", new User());
        
        return "users";
    }
    
    @PostMapping
    public String addUser(ModelMap modelMap, @ModelAttribute User newUser) {
        System.out.println("Adding new user");
        
        userService.save(newUser);
        
        return "redirect:/users";
    }
    
    @PostMapping("/delete")
    public String deleteUser(ModelMap modelMap, @RequestParam Integer idUser) {
        System.out.println("Deleting existing user");
        
        User userToDelete = userService.findById(idUser);
        userService.delete(userToDelete);
        
        return "redirect:/users";
    }
    
    @GetMapping("/update")
    public String showUpdateUser(ModelMap modelMap, @RequestParam Integer idUser) {
        System.out.println("Showing user to update");
        
        User userToUpdate = userService.findById(idUser);
        
        modelMap.addAttribute("userToUpdate", userToUpdate);
        
        return "userUpdate";
    }
    
    @PostMapping("/update")
    public String saveUpdateUser(ModelMap modelMap, @ModelAttribute User userToUpdate) {
        System.out.println("Saving user to update");
        
        userService.save(userToUpdate);
        
        return "redirect:/users";
    }

}

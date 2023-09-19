package com.movie.userservice.Service;

import com.movie.userservice.Model.User;
import com.movie.userservice.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;

@org.springframework.stereotype.Service
public class Service {
    @Autowired
    UserRepository userRepository;

    public String addUser(User user){
        this.userRepository.save(user);
        return "added successfuly";
    }
    public String deleteUser(Integer id){
        this.userRepository.deleteById(id);
        return "user delete";
    }
    public String updateUser(Integer id, User user){
        User user1= new User();
        user1=this.userRepository.findById(id).get();
        user1.setEmail(user.getEmail());
        user1.setId(user.getId());
        user1.setName(user.getName());
        user1.setLocation(user.getLocation());
        this.userRepository.save(user1);
        return "user update";
    }
}

package com.movie.userservice.Controller;

import com.movie.userservice.Model.User;
import com.movie.userservice.Repository.UserRepository;
import com.movie.userservice.Service.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("v1/users")
public class UserController {
@Autowired
Service service;
@PostMapping("/add")
public String add(@RequestBody User user){
   return this.service.addUser(user);

}
@DeleteMapping("/delete/{id}")
public String delete(@PathVariable Integer id){
    return this.service.deleteUser(id);
}
@PutMapping("/update/{id}")
public String update(@PathVariable Integer id, @RequestBody User user ){
    return this.service.updateUser(id, user);
}
}

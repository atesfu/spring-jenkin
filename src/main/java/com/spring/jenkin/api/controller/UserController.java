package com.spring.jenkin.api.controller;

import com.spring.jenkin.api.model.User;
import com.spring.jenkin.api.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("users")
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping()
    public ResponseEntity<?> getAllUsers(){
        List<User> users= userService.getAllUsers();
        if(users.size()==0){
            return  ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
        }
        return ResponseEntity.status(HttpStatus.FOUND).body(users);
    }
    @GetMapping("/{id}")
    public ResponseEntity<?> getOneUser(@PathVariable Long id){
        User user= userService.getOneUSer(id);
        if(user==null){
            return  ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
        }
        return ResponseEntity.status(HttpStatus.FOUND).body(user);
    }

    @PostMapping()
    public ResponseEntity<?> getOneUser(@RequestBody User newUser){
        User user= userService.addUser(newUser);
        if(user==null){
            return  ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
        }
        return ResponseEntity.status(HttpStatus.FOUND).body(user);
    }


}

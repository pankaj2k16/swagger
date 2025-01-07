package com.epankaj.swagger.controller;


import com.epankaj.swagger.entity.User;
import com.epankaj.swagger.service.UserService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/user")
public class UserController {

    @Autowired
    UserService userService;

    // create user
    @Operation(summary = "Create User", description = "Create a new user")
    @ApiResponse(responseCode = "200", description = "User created successfully")
    @PostMapping("/createUser")
    public User createUser(@RequestBody User user) {
        return userService.createUser(user);

    }

    // get user by id
    @GetMapping("/getUserById")
    @Operation(summary = "Get User by ID", description = "Get user by ID")
    @ApiResponse(responseCode = "200", description = "User found")
    public User getUserById(@RequestParam Integer id) {
        return userService.getUserById(id).orElse(null);
    }

    // get all users
    @GetMapping("/getAllUsers")
    @Operation(summary = "Get All Users", description = "Get all users")
    @ApiResponse(responseCode = "200", description = "Users found")
    public List<User> getAllUsers() {
        return userService.getAllUsers();
    }


    // delete user by id
    @DeleteMapping("/deleteUserById")
    @Operation(summary = "Delete User by ID", description = "Delete user by ID")
    @ApiResponse(responseCode = "200", description = "User deleted")
    public void deleteUserById(@RequestParam Integer id) {
        userService.deleteUserById(id);
    }

    // delete all users
    @Operation(summary = "Delete All Users", description = "Delete all users")
    @ApiResponse(responseCode = "200", description = "All users deleted")
    @DeleteMapping("/deleteAllUsers")
    public void deleteAllUsers() {
        userService.deleteAllUsers();
    }


}

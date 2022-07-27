package com.example.APITask;

import com.example.APITask.UserRequestBody.CreateUserRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("api/users")

public class UserController {
    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/createUser")
    public User createStudent(@RequestBody  CreateUserRequest createUserRequest){
        return userService.createUser(createUserRequest);
    }

    @GetMapping("/getAllUsers")
    public List<User> getAllUsers(){
        return userService.getAllUsers();
    }

    @DeleteMapping("/deleteUser")
    public String deleteUser(@RequestParam String id){
        return (userService.deleteUser(id));
    }





}

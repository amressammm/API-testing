package com.example.APITask;

import com.example.APITask.UserRequestBody.CreateUserRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class UserService {
    @Autowired
    private UserRepository userRepository;
    public User createUser(CreateUserRequest request){
        User user= User.builder()
                        .Name(request.Name())
                        .Age(request.Age())
                        .Email(request.Email())
                        .build();

        userRepository.save(user);
        return (user);

    }

    public List<User> getAllUsers(){

        return(userRepository.findAll());
    }

    public String deleteUser(String id){

        if(userRepository.findById(id).isEmpty())
            return ("no user found");

        userRepository.deleteById(id);
        return("user deleted");
    }

}

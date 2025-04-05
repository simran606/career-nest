package com.careernest.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.careernest.model.input.UserInputModel;
import com.careernest.model.result.UserResultModel;
import com.careernest.repository.UserRepository;

@Service
public class UserService implements IUserService {

    @Autowired
    private UserRepository userRepository;

    public UserResultModel signup(UserInputModel userInputModel){
        UserResultModel userResultModel = new UserResultModel();
        try {
            UserInputModel savedUser = userRepository.save(userInputModel);
            userResultModel.setStatus("SUCCESS");
            userResultModel.setMessage("User registered successfully.");
            userResultModel.setData(savedUser);
            return userResultModel;
        } catch (Exception e) {
            userResultModel.setMessage("ERROR");
            userResultModel.setMessage("Something went wrong during signup process " + e.getMessage());
            return null;
        }
    }

}

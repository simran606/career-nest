package com.careernest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.careernest.adapter.IUserAdapter;
import com.careernest.model.input.UserInputModel;
import com.careernest.model.result.UserResultModel;

@RestController
@RequestMapping("/api/user")
@CrossOrigin(origins = "*")
public class UserController {

    @Autowired
    private IUserAdapter iUserAdapter;

    @PostMapping("/signup")
    public UserResultModel signUp(@RequestBody UserInputModel userInputModel){
        return iUserAdapter.signup(userInputModel);
    }
    
}

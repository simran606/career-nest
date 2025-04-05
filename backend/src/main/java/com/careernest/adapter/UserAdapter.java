package com.careernest.adapter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.careernest.model.input.UserInputModel;
import com.careernest.model.result.UserResultModel;
import com.careernest.service.IUserService;

@Service
public class UserAdapter implements IUserAdapter {

    @Autowired
    private IUserService iuserService;

    public UserResultModel signup(UserInputModel userInputModel){
        return iuserService.signup(userInputModel);
    }
    
}

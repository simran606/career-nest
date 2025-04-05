package com.careernest.service;

import com.careernest.model.input.UserInputModel;
import com.careernest.model.result.UserResultModel;

public interface IUserService {
    
    UserResultModel signup(UserInputModel userInputModel);
 
}

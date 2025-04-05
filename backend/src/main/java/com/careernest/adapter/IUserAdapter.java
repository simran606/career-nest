package com.careernest.adapter;

import com.careernest.model.input.UserInputModel;
import com.careernest.model.result.UserResultModel;

public interface IUserAdapter {

    UserResultModel signup(UserInputModel userInputModel);
    
}

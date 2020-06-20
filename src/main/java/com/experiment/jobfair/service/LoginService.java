package com.experiment.jobfair.service;

import com.experiment.jobfair.entity.LoginUser;
import com.experiment.jobfair.utils.ResponseUtil;

public interface LoginService {
    ResponseUtil getLogin(LoginUser loginUser);
    LoginUser register(LoginUser loginUser);
}

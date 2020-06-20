package com.experiment.jobfair.service;

import com.experiment.jobfair.dto.LoginUser;
import com.experiment.jobfair.utils.ResponseUtil;

public interface LoginService {
    ResponseUtil getLogin(LoginUser loginUser);
//    ResponseUtil addLogin(LoginUser loginUser);
}

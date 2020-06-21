package com.experiment.jobfair.controller;

import com.experiment.jobfair.entity.LoginUser;
import com.experiment.jobfair.service.LoginService;
import com.experiment.jobfair.utils.ResponseUtil;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@RestController
@RequestMapping("/user")
@CrossOrigin("http://localhost:8081")
public class LoginController {
    @Resource
    private LoginService loginService;

    @RequestMapping(value = "/sign_in",method = RequestMethod.POST)
    public ResponseUtil signIn(@RequestBody LoginUser loginUser) {
        System.out.println(loginUser);
        return loginService.getLogin(loginUser);
    }

//    @RequestMapping(value = "/sign_up",method = RequestMethod.POST)
//    public ResponseUtil signUp(@RequestBody LoginUser loginUser) {
//        Student save = LoginRepository.save(student);
//        return save;
//    }
}
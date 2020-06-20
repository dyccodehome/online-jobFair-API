package com.experiment.jobfair.service.Impl;

import com.experiment.jobfair.entity.Applicant;
import com.experiment.jobfair.entity.Login;
import com.experiment.jobfair.entity.LoginUser;
import com.experiment.jobfair.repository.LoginRepository;
import com.experiment.jobfair.repository.LoginUserRepository;
import com.experiment.jobfair.service.LoginService;
import com.experiment.jobfair.utils.ResponseUtil;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class LoginServiceImpl implements LoginService{
    @Resource
    private LoginRepository loginRepository;




    @Override
    public ResponseUtil getLogin(LoginUser loginUser) {
        Login login = loginRepository.findLoginByUsername(loginUser.getUsername());
        //账号有效
        if (login != null){
            //判断密码是否正确
            if (loginUser.getPassword().equals(login.getPassword())){
                return new ResponseUtil(0,"登陆成功！",login);
            }else {
                return new ResponseUtil(0,"密码错误！",null);
            }
        }else {
            return new ResponseUtil(0,"账号错误！",null);
        }
    }

//    @Override
//    public ResponseUtil addApplicant(LoginUser loginUser) {
//        List<Login> loginapplicantList = loginRepository.findAll();
//        boolean flag = false;
//        for (Login applicants: loginapplicantList) {
//            if (loginUser.getUsername().equals(applicants.getUsername())){
//                flag = true;
//            }
//        }
//        if (flag){
//            return new ResponseUtil(0,"account exist",1);
//        }else {
//            loginRepository.save(loginUser);
//            return new ResponseUtil(1,"save success",null);
//        }
//    }
//
//    @Override
//    public ResponseUtil addCompany(LoginUser loginUser) {
//        return null;
//    }


}

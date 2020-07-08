package com.experiment.jobfair.controller;

import com.experiment.jobfair.dto.ApplicantDTO;
import com.experiment.jobfair.dto.CompanyDTO;
import com.experiment.jobfair.dto.LoginUser;
import com.experiment.jobfair.entity.Applicant;
import com.experiment.jobfair.entity.Company;
import com.experiment.jobfair.service.LoginService;
import com.experiment.jobfair.utils.ResponseUtil;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@RestController//Controller
@RequestMapping("/user")
@CrossOrigin("http://localhost:8081")//解决跨域问题
public class LoginController {
    @Resource
    private LoginService loginService;

    @RequestMapping(value = "/sign_in",method = RequestMethod.POST)//登录接口
    public ResponseUtil signIn(@RequestBody LoginUser loginUser) {
        return loginService.getLogin(loginUser);
    }

    @RequestMapping(value = "/applicant/sign_up",method = RequestMethod.POST)//应聘者注册接口
    public Applicant signUp(@RequestBody ApplicantDTO applicantDTO) {
        Applicant applicant = loginService.signUpApplicant(applicantDTO);
        return applicant;
    }


    @RequestMapping(value = "/company/sign_up",method = RequestMethod.POST)//企业注册接口
    public Company signUp(@RequestBody CompanyDTO companyDTO) {
        Company company = loginService.signUpCompany(companyDTO);
        return company;
    }
}
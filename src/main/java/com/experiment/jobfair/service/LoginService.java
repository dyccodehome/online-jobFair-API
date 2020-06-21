package com.experiment.jobfair.service;

import com.experiment.jobfair.dto.ApplicantDTO;
import com.experiment.jobfair.dto.CompanyDTO;
import com.experiment.jobfair.dto.LoginUser;
import com.experiment.jobfair.entity.Applicant;
import com.experiment.jobfair.entity.Company;
import com.experiment.jobfair.utils.ResponseUtil;

public interface LoginService {
    ResponseUtil getLogin(LoginUser loginUser);
//    ResponseUtil addLogin(LoginUser loginUser);
    //企业注册
    Company signUpCompany(CompanyDTO companyDTO);

    //应聘者注册
    Applicant signUpApplicant(ApplicantDTO applicantDTO);
}

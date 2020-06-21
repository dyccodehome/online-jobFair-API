package com.experiment.jobfair.service.Impl;

import com.experiment.jobfair.dto.ApplicantDTO;
import com.experiment.jobfair.dto.CompanyDTO;
import com.experiment.jobfair.entity.Applicant;
import com.experiment.jobfair.entity.Company;
import com.experiment.jobfair.entity.Login;
import com.experiment.jobfair.dto.LoginUser;
import com.experiment.jobfair.entity.Resume;
import com.experiment.jobfair.repository.ApplicantRepository;
import com.experiment.jobfair.repository.CompanyRepository;
import com.experiment.jobfair.repository.LoginRepository;
import com.experiment.jobfair.repository.ResumeRepository;
import com.experiment.jobfair.service.LoginService;
import com.experiment.jobfair.utils.ResponseUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Date;

@Service
public class LoginServiceImpl implements LoginService {
    @Resource
    private LoginRepository loginRepository;

    @Autowired
    private CompanyRepository companyRepository;

    @Autowired
    private ApplicantRepository applicantRepository;

    @Autowired
    private ResumeRepository resumeRepository;


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

    @Override
    public Company signUpCompany(CompanyDTO companyDTO) {
        Company company = new Company();
        company.setTaxNumber(companyDTO.getTaxNumber());
        company.setName(companyDTO.getName());
        company.setAddress(companyDTO.getAddress());
        company.setLeagalPerson(companyDTO.getLeagalPerson());
        company.setScope(companyDTO.getScope());
        company.setPhone(companyDTO.getPhone());
        company.setRegisteredCapital(companyDTO.getRegisteredCapital());
        company.setDeleteFlag(0);
        Date date = new Date();
        company.setCreateTime(date);
        company.setUpdateTime(date);
        companyRepository.save(company);

        Login login = new Login();
        login.setUsername(company.getPhone());
        login.setPassword(company.getTaxNumber());
        login.setSalt(company.getPhone());
        login.setUser_id(company.getId());
        login.setIs_admin_role(2);
        login.setDelete_flag(0);
        login.setCreate_time(date);
        login.setUpdate_time(date);
        loginRepository.save(login);
        return company;
    }

    @Override
    public Applicant signUpApplicant(ApplicantDTO applicantDTO) {
        Resume resume = new Resume();
        resume.setName(applicantDTO.getName());
        resume.setAge(applicantDTO.getAge());
        resume.setPhone(applicantDTO.getPhone());
        resume.setFolk("无");
        resume.setCollege("无");
        resume.setEducation("无");
        resume.setAdvantage("无");
        resume.setExpect("无");
        resume.setExperience("无");
        resume.setCredentials("无");
        resume.setBlog("无");
        resume.setDeleteFlag(0);
        Date date = new Date();
        resume.setCreateTime(date);
        resume.setUpdateTime(date);
        resumeRepository.save(resume);

        Applicant applicant = new Applicant();
        applicant.setSex(applicantDTO.getSex());
        applicant.setPhone(applicantDTO.getPhone());
        applicant.setName(applicantDTO.getName());
        applicant.setAge(applicantDTO.getAge());
        applicant.setDeleteFlag(0);
        applicant.setCreateTime(date);
        applicant.setUpdateTime(date);
        applicant.setResumeId(resume.getId());
        applicantRepository.save(applicant);

        Login login = new Login();
        login.setUsername(applicant.getPhone());
        login.setPassword(applicant.getPhone());
        login.setSalt(applicant.getPhone());
        login.setUser_id(applicant.getId());
        login.setIs_admin_role(1);
        login.setDelete_flag(0);
        login.setCreate_time(date);
        login.setUpdate_time(date);
        loginRepository.save(login);
        return applicant;
    }
}

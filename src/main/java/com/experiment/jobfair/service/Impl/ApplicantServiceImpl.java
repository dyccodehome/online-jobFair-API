package com.experiment.jobfair.service.Impl;

import com.experiment.jobfair.dto.ApplicantDTO;
import com.experiment.jobfair.entity.Applicant;
import com.experiment.jobfair.repository.ApplicantRepository;
import com.experiment.jobfair.service.ApplicantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

/**
 * created by 邓益聪
 * 2020-06-18
 */

@Service
public class ApplicantServiceImpl implements ApplicantService {

    @Autowired
    private ApplicantRepository applicantRepository;

    @Override
    public Applicant updateApplicant(ApplicantDTO applicantDTO) {
        Applicant applicant = applicantRepository.findById(applicantDTO.getId()).get();
        applicant.setAge(applicantDTO.getAge());
        Date date = new Date();
        applicant.setUpdateTime(date);
        applicant.setName(applicantDTO.getName());
        applicant.setPhone(applicantDTO.getPhone());
        applicant.setSex(applicantDTO.getSex());
        return applicantRepository.save(applicant);
    }
}

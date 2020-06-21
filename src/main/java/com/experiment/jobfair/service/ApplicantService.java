package com.experiment.jobfair.service;

import com.experiment.jobfair.dto.ApplicantDTO;
import com.experiment.jobfair.entity.Applicant;
import org.springframework.data.domain.Page;

/**
 * created by 邓益聪
 * 2020-06-18
 */

public interface ApplicantService {

    Applicant updateApplicant(ApplicantDTO applicantDTO);

    Applicant findById(Integer integer);

    Page<Applicant> getAll(Integer pageNum, Integer size, String keywords);

    Applicant del(Integer integer);
}

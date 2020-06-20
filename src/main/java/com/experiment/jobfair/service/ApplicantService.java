package com.experiment.jobfair.service;

import com.experiment.jobfair.dto.ApplicantDTO;
import com.experiment.jobfair.entity.Applicant;

/**
 * created by 邓益聪
 * 2020-06-18
 */

public interface ApplicantService {

    Applicant updateApplicant(ApplicantDTO applicantDTO);

    Applicant findById(Integer integer);
}

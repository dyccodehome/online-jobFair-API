package com.experiment.jobfair.controller;

import com.experiment.jobfair.dto.ApplicantDTO;
import com.experiment.jobfair.entity.Applicant;
import com.experiment.jobfair.repository.ApplicantRepository;
import com.experiment.jobfair.service.ApplicantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * created by 邓益聪
 * 2020-06-20
 */

@RequestMapping("/sys/api")
@CrossOrigin
@RestController
public class ApplicantController {

    @Autowired
    private ApplicantService applicantService;

    @RequestMapping(value = "/updateApplicant", method = RequestMethod.POST)
    public Applicant updateApplicant(@RequestBody ApplicantDTO applicantDTO){
        return applicantService.updateApplicant(applicantDTO);
    }

    @RequestMapping(value = "/findApplicant",method = RequestMethod.POST)
    public Applicant getResume(@RequestParam Integer applicantId){
        return applicantService.findById(applicantId);
    }

}

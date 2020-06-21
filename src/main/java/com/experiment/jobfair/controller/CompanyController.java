package com.experiment.jobfair.controller;

import com.experiment.jobfair.dto.ApplicantDTO;
import com.experiment.jobfair.dto.CompanyDTO;
import com.experiment.jobfair.entity.Applicant;
import com.experiment.jobfair.entity.Company;
import com.experiment.jobfair.service.ApplicantService;
import com.experiment.jobfair.service.CompanyService;
import com.experiment.jobfair.utils.ResponseUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/sys/api")
@CrossOrigin
@RestController
public class CompanyController {
    @Autowired
    private CompanyService companyService;

    @RequestMapping(value = "/updateCompany", method = RequestMethod.POST)
    public Company updateApplicant(@RequestBody CompanyDTO companyDTO){
        return companyService.updateCompany(companyDTO);
    }

    @RequestMapping(value = "/addCompany",method = RequestMethod.POST)
    public Company addCompany(@RequestBody CompanyDTO companyDTO){
        return companyService.addCompany(companyDTO);
    }
}

package com.experiment.jobfair.service;

import com.experiment.jobfair.dto.CompanyDTO;
import com.experiment.jobfair.entity.Company;
import com.experiment.jobfair.utils.ResponseUtil;

/**
 * created by 邓益聪
 * 2020-06-18
 */

public interface CompanyService {

//    ResponseUtil addCompany(CompanyDTO companyDTO);
    Company addCompany(CompanyDTO companyDTO);

    Company updateCompany(CompanyDTO companyDTO);
}

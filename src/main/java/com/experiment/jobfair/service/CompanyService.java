package com.experiment.jobfair.service;

import com.experiment.jobfair.dto.CompanyDTO;
import com.experiment.jobfair.entity.Company;
import org.springframework.data.domain.Page;

/**
 * created by 邓益聪
 * 2020-06-18
 */

public interface CompanyService {

    Company addCompany(CompanyDTO companyDTO);

    Company updateCompany(CompanyDTO companyDTO);

    Page<Company> getAll(Integer pageNum, Integer size, String keywords);

    Company del(Integer integer);

    Company findById(Integer integer);

}

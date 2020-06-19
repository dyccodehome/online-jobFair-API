package com.experiment.jobfair.service.Impl;

import com.experiment.jobfair.dto.CompanyDTO;
import com.experiment.jobfair.entity.Company;
import com.experiment.jobfair.repository.CompanyRepository;
import com.experiment.jobfair.service.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

/**
 * created by 邓益聪
 * 2020-06-18
 */

@Service
public class CompanyServiceImpl  implements CompanyService {

    @Autowired
    private CompanyRepository companyRepository;

    @Override
    public Company addCompany(CompanyDTO companyDTO) {
        Company company = new Company();
        Date date = new Date();
        company.setAddress(companyDTO.getAddress());
        company.setCreateTime(date);
        company.setUpdateTime(date);
        company.setDeleteFlag(0);
        company.setLegalPerson(companyDTO.getLegalPerson());
        company.setName(companyDTO.getName());
        company.setLoginId(companyDTO.getLoginId());
        company.setRegisteredCapital(companyDTO.getRegisteredCapital());
        company.setScope(companyDTO.getScope());
        company.setTaxNumber(companyDTO.getTaxNumber());
        company.setPhone(companyDTO.getPhone());
        company.setLegalPerson(companyDTO.getLegalPerson());

        return companyRepository.save(company);
    }

    @Override
    public Company updateCompany(CompanyDTO companyDTO) {
        Company company = companyRepository.findById(companyDTO.getId()).get();
        if (company !=null)
        {
            Date date = new Date();
            company.setAddress(companyDTO.getAddress());
            company.setTaxNumber(companyDTO.getTaxNumber());
            company.setRegisteredCapital(companyDTO.getRegisteredCapital());
            company.setCreateTime(date);
            company.setLegalPerson(companyDTO.getLegalPerson());
            company.setName(companyDTO.getName());
            company.setLoginId(companyDTO.getLoginId());
            company.setScope(companyDTO.getScope());
            company.setPhone(companyDTO.getPhone());
            company.setLegalPerson(companyDTO.getLegalPerson());
            return companyRepository.save(company);
        }
        return null;
    }
}

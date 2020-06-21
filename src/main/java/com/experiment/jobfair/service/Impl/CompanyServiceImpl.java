package com.experiment.jobfair.service.Impl;

import com.experiment.jobfair.dto.CompanyDTO;
import com.experiment.jobfair.entity.Company;
import com.experiment.jobfair.repository.CompanyRepository;
import com.experiment.jobfair.service.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
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
        company.setLeagalPerson(companyDTO.getLeagalPerson());
        company.setName(companyDTO.getName());
        company.setRegisteredCapital(companyDTO.getRegisteredCapital());
        company.setScope(companyDTO.getScope());
        company.setTaxNumber(companyDTO.getTaxNumber());
        company.setPhone(companyDTO.getPhone());

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
            company.setLeagalPerson(companyDTO.getLeagalPerson());
            company.setName(companyDTO.getName());
            company.setScope(companyDTO.getScope());
            company.setPhone(companyDTO.getPhone());
            return companyRepository.save(company);
        }
        return null;
    }

    @Override
    public Page<Company> getAll(Integer pageNum, Integer size, String keywords) {
        PageRequest pageRequest = PageRequest.of(pageNum,size);
        Page<Company> page = companyRepository.getPage(keywords,pageRequest);
        return page;
    }

    @Override
    public Company del(Integer integer) {
        Company company = companyRepository.findById(integer).orElse(null);
        if (company != null)
        {
            company.setDeleteFlag(1);
            return companyRepository.save(company);
        }
        return null;
    }

    @Override
    public Company findById(Integer integer) {
        Company company = companyRepository.findById(integer).get();
        return company;
    }
}

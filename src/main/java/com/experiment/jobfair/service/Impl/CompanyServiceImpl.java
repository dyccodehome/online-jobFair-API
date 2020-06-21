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
        company.setRegisteredCapital(companyDTO.getRegisteredCapital());
        company.setScope(companyDTO.getScope());
        company.setTaxNumber(companyDTO.getTaxNumber());
        company.setPhone(companyDTO.getPhone());
        company.setLegalPerson(companyDTO.getLegalPerson());
        return companyRepository.save(company);

//        List<CompanyDTO> companyDTOList = companyDTORepository.findAll();
//        boolean flag = false;
//        for (CompanyDTO companyDTOs: companyDTOList) {
//            if (companyDTO.getName().equals(companyDTOs.getName())){
//                flag = true;
//            }
//        }
//        if (flag){
//            return new ResponseUtil(0,"account exist",1);
//        }else {
//            companyDTORepository.save(companyDTO);
//            return new ResponseUtil(1,"save success",null);
//        }
    }

    @Override
    public Company updateCompany(CompanyDTO companyDTO) {
        Company company = companyRepository.findById(companyDTO.getId()).get();
        if (company != null)
        {
            Date date = new Date();
            company.setAddress(companyDTO.getAddress());
            company.setTaxNumber(companyDTO.getTaxNumber());
            company.setRegisteredCapital(companyDTO.getRegisteredCapital());
            company.setCreateTime(date);
            company.setLegalPerson(companyDTO.getLegalPerson());
            company.setName(companyDTO.getName());
            company.setScope(companyDTO.getScope());
            company.setPhone(companyDTO.getPhone());
            company.setLegalPerson(companyDTO.getLegalPerson());
            return companyRepository.save(company);
        }
        return null;
    }
}

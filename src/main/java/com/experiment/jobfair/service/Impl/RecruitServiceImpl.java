package com.experiment.jobfair.service.Impl;

import com.experiment.jobfair.dto.RecruitDTO;
import com.experiment.jobfair.entity.Recruit;
import com.experiment.jobfair.repository.RecruitRepository;
import com.experiment.jobfair.service.RecruitService;
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
public class RecruitServiceImpl implements RecruitService {

    @Autowired
    private RecruitRepository recruitRepository;

    @Override
    public Page<Recruit> getPage(Integer pageNum, Integer size,Integer companyId) {
        PageRequest pageRequest = PageRequest.of(pageNum,size);
        Page<Recruit> page = recruitRepository.findCompany(companyId,pageRequest);
        return page;
    }

    @Override
    public Recruit addRecruit(RecruitDTO recruitDTO) {
        Recruit recruit = new Recruit();
        recruit.setAddress(recruitDTO.getAddress());
        recruit.setDeleteFlag(0);
        recruit.setDetails(recruitDTO.getDetails());
        recruit.setEducation(recruitDTO.getEducation());
        recruit.setCompanyId(recruitDTO.getCompanyId());
        recruit.setPhone(recruitDTO.getPhone());
        recruit.setSalary(recruitDTO.getSalary());
        recruit.setTitle(recruitDTO.getTitle());
        recruit.setWorkTime(recruitDTO.getWorkTime());
        Date date = new Date();
        recruit.setCreateTime(date);
        recruit.setUpdateTime(date);

        return recruitRepository.save(recruit);
    }

    @Override
    public Recruit delRecruit(Integer integer) {
        Recruit recruit = recruitRepository.findById(integer).orElse(null);
        if (recruit != null)
        {
            recruit.setDeleteFlag(1);
            return recruitRepository.save(recruit);
        }
        return null;
    }
}

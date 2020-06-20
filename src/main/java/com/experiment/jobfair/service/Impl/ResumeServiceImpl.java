package com.experiment.jobfair.service.Impl;

import com.experiment.jobfair.dto.ResumeDTO;
import com.experiment.jobfair.entity.Recruit;
import com.experiment.jobfair.entity.Resume;
import com.experiment.jobfair.repository.RecruitRepository;
import com.experiment.jobfair.repository.ResumeRepository;
import com.experiment.jobfair.service.ResumeService;
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
public class ResumeServiceImpl  implements ResumeService {

    @Autowired
    private ResumeRepository resumeRepository;

    @Autowired
    private RecruitRepository recruitRepository;

    @Override
    public Page<Resume> getPage(Integer pageNum, Integer size, String keywords) {
        PageRequest pageRequest = PageRequest.of(pageNum,size);
        Page<Resume> page = resumeRepository.findAllLike(keywords,pageRequest);
        return page;
    }

    @Override
    public Resume findByResumeId(Integer resumeId) {
        return resumeRepository.findById(resumeId).get();
    }

    @Override
    public Resume updateResume(ResumeDTO resumeDTO) {
        Resume resume = resumeRepository.findById(resumeDTO.getId()).get();
        Date date = new Date();
        resume.setAdvantage(resumeDTO.getAdvantage());
        resume.setAge(resumeDTO.getAge());
        resume.setBlog(resumeDTO.getBlog());
        resume.setCollege(resumeDTO.getCollege());
        resume.setCredentials(resumeDTO.getCredentials());
        resume.setDeleteFlag(0);
        resume.setEducation(resumeDTO.getEducation());
        resume.setExpect(resumeDTO.getExpect());
        resume.setExperience(resumeDTO.getExperience());
        resume.setFolk(resumeDTO.getFolk());
        resume.setName(resumeDTO.getName());
        resume.setPhone(resumeDTO.getPhone());
        resume.setUpdateTime(date);
        return resumeRepository.save(resume);
    }

}

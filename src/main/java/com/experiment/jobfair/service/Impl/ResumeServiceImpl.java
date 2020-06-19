package com.experiment.jobfair.service.Impl;

import com.experiment.jobfair.entity.Resume;
import com.experiment.jobfair.repository.ResumeRepository;
import com.experiment.jobfair.service.ResumeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

/**
 * created by 邓益聪
 * 2020-06-18
 */

@Service
public class ResumeServiceImpl  implements ResumeService {

    @Autowired
    private ResumeRepository resumeRepository;

    @Override
    public Page<Resume> getPage(Integer pageNum, Integer size, String keywords) {
        PageRequest pageRequest = PageRequest.of(pageNum,size);
        Page<Resume> page = resumeRepository.findAllLike(keywords,pageRequest);
        return page;
    }
}

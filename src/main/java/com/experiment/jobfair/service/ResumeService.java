package com.experiment.jobfair.service;

import com.experiment.jobfair.dto.ResumeDTO;
import com.experiment.jobfair.entity.Recruit;
import com.experiment.jobfair.entity.Resume;
import org.springframework.data.domain.Page;

/**
 * created by 邓益聪
 * 2020-06-18
 */

public interface ResumeService {

    Page<Resume> getPage(Integer pageNum,Integer size,String keywords);

    Resume findByResumeId(Integer resumeId);

    Resume updateResume(ResumeDTO resumeDTO);

}

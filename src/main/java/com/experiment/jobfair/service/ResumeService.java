package com.experiment.jobfair.service;

import com.experiment.jobfair.entity.Resume;
import org.springframework.data.domain.Page;

/**
 * created by 邓益聪
 * 2020-06-18
 */

public interface ResumeService {

    Page<Resume> getPage(Integer pageNum,Integer size,String keywords);
}

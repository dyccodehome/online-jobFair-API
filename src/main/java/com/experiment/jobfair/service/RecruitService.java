package com.experiment.jobfair.service;

import com.experiment.jobfair.dto.RecruitDTO;
import com.experiment.jobfair.entity.Recruit;
import org.springframework.data.domain.Page;

/**
 * 招聘信息
 * created by 邓益聪
 * 2020-06-18
 */

public interface RecruitService {

    //获取公司招聘信息
    Page<Recruit> getPage(Integer pageNum, Integer size,Integer companyId);

    //发布招聘信息
    Recruit addRecruit(RecruitDTO recruitDTO);

    //取消招聘信息
    Recruit delRecruit(Integer integer);

    //获取公司招聘信息
    Page<Recruit> getAll(Integer pageNum, Integer size, String keywords);
}

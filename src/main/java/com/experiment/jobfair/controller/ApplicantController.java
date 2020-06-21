package com.experiment.jobfair.controller;

import com.experiment.jobfair.dto.ApplicantDTO;
import com.experiment.jobfair.entity.Applicant;
import com.experiment.jobfair.repository.ApplicantRepository;
import com.experiment.jobfair.service.ApplicantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

/**
 * created by 邓益聪
 * 2020-06-20
 */

@RequestMapping("/sys/api")
@CrossOrigin
@RestController
public class ApplicantController {

    @Autowired
    private ApplicantService applicantService;

    Integer count;
    @RequestMapping(value = "/updateApplicant", method = RequestMethod.POST)
    public Applicant updateApplicant(@RequestBody ApplicantDTO applicantDTO){
        return applicantService.updateApplicant(applicantDTO);
    }

    @RequestMapping(value = "/findApplicant",method = RequestMethod.GET)
    public Applicant getResume(@RequestParam Integer applicantId){
        return applicantService.findById(applicantId);
    }

    @RequestMapping(value = "/queryApplicant",method = RequestMethod.GET)
    public Map getAll(@RequestParam Integer pageNum, @RequestParam String keywords){
        if (pageNum == null || pageNum == 0)
        {
            pageNum=1;
        }
        if (count!=null && pageNum >=count){
            pageNum = count;
        }
        Page<Applicant> page = applicantService.getAll(pageNum-1,10,keywords);
        Map<String,Object> map = new HashMap<String,Object>();
        map.put("data",page.getContent());
        map.put("pageNum",page.getTotalElements());
        return map;
    }

    @RequestMapping(value = "/delApplicant",method = RequestMethod.GET)
    public Applicant del(@RequestParam Integer pkId){
        return applicantService.del(pkId);
    }

}

package com.experiment.jobfair.controller;

import com.experiment.jobfair.dto.ResumeDTO;
import com.experiment.jobfair.entity.Resume;
import com.experiment.jobfair.service.ResumeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

/**
 * created by 邓益聪
 * 2020-06-18
 */

@RestController
@CrossOrigin
@RequestMapping("/sys/api")
public class ResumeController {

    @Autowired
    private ResumeService resumeService;

    Integer count;
    @RequestMapping(value = "/queryResume",method = RequestMethod.GET)
    public Map getPage(@RequestParam Integer pageNum,@RequestParam String keywords){
        if (pageNum == null || pageNum == 0)
        {
            pageNum=1;
        }
        if (count!=null && pageNum >=count){
            pageNum = count;
        }
        Page<Resume> page = resumeService.getPage(pageNum-1,10,keywords);
        Map<String,Object> map = new HashMap<String,Object>();
        map.put("data",page.getContent());
        map.put("pageNum",page.getTotalElements());
        return map;
    }

    @RequestMapping(value = "/findById",method = RequestMethod.POST)
    public Resume getResume(@RequestParam Integer resumeId){
        return resumeService.findByResumeId(resumeId);
    }

    @RequestMapping(value = "/updateResume",method = RequestMethod.POST)
    public Resume updateResume(@RequestBody ResumeDTO resumeDTO){
        return resumeService.updateResume(resumeDTO);
    }
}

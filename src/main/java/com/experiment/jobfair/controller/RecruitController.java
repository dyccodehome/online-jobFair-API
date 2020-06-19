package com.experiment.jobfair.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.experiment.jobfair.dto.RecruitDTO;
import com.experiment.jobfair.entity.Recruit;
import com.experiment.jobfair.entity.Resume;
import com.experiment.jobfair.service.RecruitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

/**
 * created by 邓益聪
 * 2020-06-18
 */

@RequestMapping("/sys/api")
@CrossOrigin
@RestController
public class RecruitController {

    @Autowired
    private RecruitService recruitService;

    Integer count;
    @RequestMapping(value = "/getPage",method = RequestMethod.GET)
    public Map getPage(@RequestParam Integer pageNum,@RequestParam Integer companyId){
        if (pageNum == null || pageNum == 0)
        {
            pageNum=1;
        }
        if (count!=null && pageNum >=count){
            pageNum = count;
        }
        Page<Recruit> page = recruitService.getPage(pageNum-1,10,companyId);
        Map<String,Object> map = new HashMap<String,Object>();
        map.put("data",page.getContent());
        map.put("pageNum",page.getTotalElements());
        return map;
    }

    @RequestMapping(value = "/addRecruit",method = RequestMethod.POST)
    public Recruit addRecruit(@RequestBody String json){
        JSONObject jsonObject = JSONObject.parseObject(json);
        RecruitDTO recruitDTO = JSON.toJavaObject(jsonObject,RecruitDTO.class);
        return recruitService.addRecruit(recruitDTO);
    }

    @RequestMapping(value = "/delRecruit",method = RequestMethod.POST)
    public Recruit delRecruit(@RequestParam Integer id){
        return recruitService.delRecruit(id);
    }
}

package com.experiment.jobfair.controller;

import com.experiment.jobfair.entity.Company;
import com.experiment.jobfair.service.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

/**
 * created by 邓益聪
 * 2020-06-21
 */

@RequestMapping("/sys/api")
@CrossOrigin
@RestController
public class CompanyController {
    @Autowired
    private CompanyService companyService;

    Integer count;
    @RequestMapping(value = "/queryCompany",method = RequestMethod.GET)
    public Map getAll(@RequestParam Integer pageNum, @RequestParam String keywords){
        if (pageNum == null || pageNum == 0)
        {
            pageNum=1;
        }
        if (count!=null && pageNum >=count){
            pageNum = count;
        }
        Page<Company> page = companyService.getAll(pageNum-1,10,keywords);
        Map<String,Object> map = new HashMap<String,Object>();
        map.put("data",page.getContent());
        map.put("pageNum",page.getTotalElements());
        return map;
    }

    @RequestMapping(value = "/delCompany",method = RequestMethod.POST)
    public Company del(@RequestParam Integer id){
        return companyService.del(id);
    }
}

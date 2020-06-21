package com.experiment.jobfair.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.experiment.jobfair.dto.CompanyDTO;
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
@CrossOrigin("http://localhost:8081")
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

    @RequestMapping(value = "/delCompany",method = RequestMethod.GET)
    public Company del(@RequestParam Integer pkId){
        System.out.println(pkId);
        return companyService.del(pkId);
    }

    @RequestMapping(value = "/findCompanyById",method = RequestMethod.GET)
    public Company getCompany(@RequestParam Integer companyId){
        return companyService.findById(companyId);
    }

    @RequestMapping(value = "/addCompany",method = RequestMethod.POST)
    public Company addCompany(@RequestBody String json){
        System.out.println(json);
        JSONObject jsonObject = JSONObject.parseObject(json);
        CompanyDTO companyDTO = JSON.toJavaObject(jsonObject,CompanyDTO.class);
        return companyService.addCompany(companyDTO);
    }
}

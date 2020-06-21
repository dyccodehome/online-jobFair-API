package com.experiment.jobfair.repository;

import com.experiment.jobfair.entity.Company;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

/**
 * created by 邓益聪
 * 2020-06-18
 */

public interface CompanyRepository extends JpaRepository<Company,Integer> {

    @Query( value = "SELECT * FROM company where name like %?1%  AND delete_flag = 0",nativeQuery = true)
    Page<Company> getPage(String keywords, PageRequest pageRequest);
}

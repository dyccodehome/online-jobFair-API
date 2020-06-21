package com.experiment.jobfair.repository;

import com.experiment.jobfair.entity.Applicant;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

/**
 * created by 邓益聪
 * 2020-06-18
 */

public interface ApplicantRepository extends JpaRepository<Applicant,Integer> {

    @Query( value = "SELECT * FROM applicant where name like %?1%  AND delete_flag = 0",nativeQuery = true)
    Page<Applicant> getPage(String keywords, PageRequest pageRequest);
}

package com.experiment.jobfair.repository;

import com.experiment.jobfair.entity.Recruit;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

/**
 * created by 邓益聪
 * 2020-06-18
 */

public interface RecruitRepository extends JpaRepository<Recruit,Integer> {

    @Query(value = "select * from recruit where company_id=?1 AND delete_flag = 0 ORDER BY create_time ASC ",nativeQuery = true)
    Page<Recruit> findCompany(Integer companyId,PageRequest pageRequest);

    @Query( value = "SELECT * FROM recruit where title like %?1%  AND delete_flag = 0",nativeQuery = true)
    Page<Recruit> findAllLike(String keywords, PageRequest pageRequest);
}

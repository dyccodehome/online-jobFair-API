package com.experiment.jobfair.repository;

import com.experiment.jobfair.entity.Resume;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

/**
 * created by 邓益聪
 * 2020-06-18
 */

public interface ResumeRepository extends JpaRepository<Resume,Integer> {

    @Query( value = "SELECT * FROM resume where name like %?1% ",nativeQuery = true)
    Page<Resume> findAllLike(String keywords, PageRequest pageRequest);
}

package com.experiment.jobfair.repository;

import com.experiment.jobfair.entity.Applicant;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * created by 邓益聪
 * 2020-06-18
 */

public interface ApplicantRepository extends JpaRepository<Applicant,Integer> {
}

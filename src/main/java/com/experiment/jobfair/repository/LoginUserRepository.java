package com.experiment.jobfair.repository;

import com.experiment.jobfair.entity.Login;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LoginUserRepository extends JpaRepository<Login,Integer> {

}

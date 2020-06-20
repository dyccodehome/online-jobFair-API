package com.experiment.jobfair.repository;

import com.experiment.jobfair.entity.Login;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Map;

public interface LoginRepository extends JpaRepository<Login,Integer> {
    Login findLoginByUsername(String username);

}

package com.experiment.jobfair.repository;

import com.experiment.jobfair.entity.Login;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LoginRepository extends JpaRepository<Login,Integer> {
    Login findLoginByUsername(String username);
}

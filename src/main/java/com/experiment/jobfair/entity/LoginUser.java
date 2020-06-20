package com.experiment.jobfair.entity;

import lombok.Data;


@Data
public class LoginUser {
    private String username;
    private String password;
    private Integer is_admin_role;
    private Integer user_id;

}
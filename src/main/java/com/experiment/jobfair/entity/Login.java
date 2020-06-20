package com.experiment.jobfair.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

@Entity
@Data
public class Login {
    @Id
    @GeneratedValue

    private Integer Id;
    @Column(nullable = false)
    private String username;
    @Column(nullable = false)
    private String password;
    private String salt;
    private Integer user_id;
    private Integer is_admin_role;
    private Integer delete_flag;
    private Date create_time;
    private Date update_time;

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getAalt() {
        return salt;
    }

    public void setAalt(String aalt) {
        this.salt = aalt;
    }

    public Integer getIs_admin_role() {
        return is_admin_role;
    }

    public void setIs_admin_role(Integer is_admin_role) {
        this.is_admin_role = is_admin_role;
    }

    public Integer getDelete_flag() {
        return delete_flag;
    }

    public void setDelete_flag(Integer delete_flag) {
        this.delete_flag = delete_flag;
    }

    public Date getCreate_time() {
        return create_time;
    }

    public void setCreate_time(Date create_time) {
        this.create_time = create_time;
    }

    public Date getUpdate_time() {
        return update_time;
    }

    public void setUpdate_time(Date update_time) {
        this.update_time = update_time;
    }

    public Integer getUser_id() {
        return user_id;
    }

    public void setUser_id(Integer user_id) {
        this.user_id = user_id;
    }

    @Override
    public String toString() {
        return "Login{" +
                "Id=" + Id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", salt='" + salt + '\'' +
                ", user_id=" + user_id +
                ", is_admin_role=" + is_admin_role +
                ", delete_flag=" + delete_flag +
                ", create_time=" + create_time +
                ", update_time=" + update_time +
                '}';
    }
}

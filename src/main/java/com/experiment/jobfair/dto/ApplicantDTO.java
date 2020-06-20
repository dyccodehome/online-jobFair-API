package com.experiment.jobfair.dto;

/**
 * created by 邓益聪
 * 2020-06-20
 */


public class ApplicantDTO {

    private Integer id;

    private String name;

    private Integer sex;

    private String phone;

    private String age;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "ApplicantDTO{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", sex=" + sex +
                ", phone='" + phone + '\'' +
                ", age='" + age + '\'' +
                '}';
    }
}

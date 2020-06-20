package com.experiment.jobfair.dto;

/**
 * created by 邓益聪
 * 2020-06-20
 */


public class ResumeDTO {
    private Integer Id;

    private String name;

    private String education;

    private String folk;

    private String age;

    private String college;

    private String phone;

    private String advantage;

    private String expect;

    private String experience;

    private String credentials;

    private String blog;

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education;
    }

    public String getFolk() {
        return folk;
    }

    public void setFolk(String folk) {
        this.folk = folk;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getCollege() {
        return college;
    }

    public void setCollege(String college) {
        this.college = college;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAdvantage() {
        return advantage;
    }

    public void setAdvantage(String advantage) {
        this.advantage = advantage;
    }

    public String getExpect() {
        return expect;
    }

    public void setExpect(String expect) {
        this.expect = expect;
    }

    public String getExperience() {
        return experience;
    }

    public void setExperience(String experience) {
        this.experience = experience;
    }

    public String getCredentials() {
        return credentials;
    }

    public void setCredentials(String credentials) {
        this.credentials = credentials;
    }

    public String getBlog() {
        return blog;
    }

    public void setBlog(String blog) {
        this.blog = blog;
    }

    @Override
    public String toString() {
        return "ResumeDTO{" +
                "Id=" + Id +
                ", name='" + name + '\'' +
                ", education='" + education + '\'' +
                ", folk='" + folk + '\'' +
                ", age='" + age + '\'' +
                ", college='" + college + '\'' +
                ", phone='" + phone + '\'' +
                ", advantage='" + advantage + '\'' +
                ", expect='" + expect + '\'' +
                ", experience='" + experience + '\'' +
                ", credentials='" + credentials + '\'' +
                ", blog='" + blog + '\'' +
                '}';
    }
}

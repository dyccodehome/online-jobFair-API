package com.experiment.jobfair.dto;

/**
 * created by 邓益聪
 * 2020-06-18
 */


public class RecruitDTO {

    private Integer Id;

    private String title;

    private String phone;

    private String details;

    private String education;

    private String salary;

    private String address;

    private String workTime;

    private Integer companyId;

    private Integer deleteFlag;

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education;
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getWorkTime() {
        return workTime;
    }

    public void setWorkTime(String workTime) {
        this.workTime = workTime;
    }

    public Integer getDeleteFlag() {
        return deleteFlag;
    }

    public void setDeleteFlag(Integer deleteFlag) {
        this.deleteFlag = deleteFlag;
    }

    public Integer getCompanyId() {
        return companyId;
    }

    public void setCompanyId(Integer companyId) {
        this.companyId = companyId;
    }

    @Override
    public String toString() {
        return "RecruitDTO{" +
                "Id=" + Id +
                ", title='" + title + '\'' +
                ", phone='" + phone + '\'' +
                ", details='" + details + '\'' +
                ", education='" + education + '\'' +
                ", salary='" + salary + '\'' +
                ", address='" + address + '\'' +
                ", workTime='" + workTime + '\'' +
                ", companyId=" + companyId +
                ", deleteFlag=" + deleteFlag +
                '}';
    }
}

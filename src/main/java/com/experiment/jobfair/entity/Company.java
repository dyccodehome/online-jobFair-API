package com.experiment.jobfair.entity;

import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

/**
 * created by 邓益聪
 * 2020-06-18
 */

@Entity
@DynamicUpdate
public class Company {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Integer Id;

    private String taxNumber;

    private String name;

    private String address;

    private String leagalPerson;

    private String scope;

    private String phone;

    private String registeredCapital;

    private Integer deleteFlag;

    private Date createTime;

    private Date updateTime;

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public String getTaxNumber() {
        return taxNumber;
    }

    public void setTaxNumber(String taxNumber) {
        this.taxNumber = taxNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getLeagalPerson() {
        return leagalPerson;
    }

    public void setLeagalPerson(String leagalPerson) {
        this.leagalPerson = leagalPerson;
    }

    public String getScope() {
        return scope;
    }

    public void setScope(String scope) {
        this.scope = scope;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getRegisteredCapital() {
        return registeredCapital;
    }

    public void setRegisteredCapital(String registeredCapital) {
        this.registeredCapital = registeredCapital;
    }

    public Integer getDeleteFlag() {
        return deleteFlag;
    }

    public void setDeleteFlag(Integer deleteFlag) {
        this.deleteFlag = deleteFlag;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    @Override
    public String toString() {
        return "Company{" +
                "Id=" + Id +
                ", taxNumber='" + taxNumber + '\'' +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", leagalPerson='" + leagalPerson + '\'' +
                ", scope='" + scope + '\'' +
                ", phone='" + phone + '\'' +
                ", registeredCapital='" + registeredCapital + '\'' +
                ", deleteFlag=" + deleteFlag +
                ", createTime=" + createTime +
                ", updateTime=" + updateTime +
                '}';
    }
}

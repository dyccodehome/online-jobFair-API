package com.experiment.jobfair.dto;

/**
 * created by 邓益聪
 * 2020-06-18
 */


public class CompanyDTO {
    private Integer Id;

    private String taxNumber;

    private String name;

    private String address;

    private String leagalPerson;

    private String scope;

    private String phone;

    private String registeredCapital;

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

    @Override
    public String toString() {
        return "CompanyDTO{" +
                "Id=" + Id +
                ", taxNumber='" + taxNumber + '\'' +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", leagalPerson='" + leagalPerson + '\'' +
                ", scope='" + scope + '\'' +
                ", phone='" + phone + '\'' +
                ", registeredCapital='" + registeredCapital + '\'' +
                '}';
    }
}

package com.sagarsoft.setrifugov1.model;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.sql.Time;
import java.util.ArrayList;
import java.util.Date;

import javax.persistence.*;

import static javax.persistence.FetchType.LAZY;


@Entity
@Table(name = "main_users")
public class MyDetails {

  @Id
  @GeneratedValue(strategy=GenerationType.IDENTITY)
  @Column
  private int id;

  @Column
  private String email;
  @Column
  private String empid;
  @Column
  private String password;
  @Column
  private String name;
  @Column
  private String role;
  @Column
  private String department;
  @Column
  private String mobile;
  
  @Column
  private String prefix;
  
  @Column
  private String firstname;
  
  @Column
  private String lastname;
  
  @Column
  private Date dateofbirth;
  
  @Column
  private String modeofemployment;
  
  @Column
  private String businessunit;
  
  @Column
  private String l1manager;
  
  @Column
  private String l2manager;
  
  @Column
  private String coemanager;
  
  @Column
  private String coeskills;
  
  @Column
  private String designation;
  
  @Column
  private String employmentstatus;
  
  @Column
  private Date probationreviewdate;
  
  @Column
  private Date dateofjoining;
  
  @Column
  private Date dateofleaving;
  
  @Column
  private int previousexperience;
  
  @Column
  private long worktelephonenumber;
  
  @Column
  private int extension;
  
  @Column
  private long fax;
  
  @Column
  private String division;
  
  @Column
  private String paytype;
  
  @Column
  private Time logintime;
  
  @Column
  private Time logouttime;
  
  @Column
  private int wrokinghours;
  
  @Column
  private String bandtype;

  public String getPrefix() {
    return prefix;
  }

  public void setPrefix(String prefix) {
    this.prefix = prefix;
  }

  public String getFirstname() {
    return firstname;
  }

  public void setFirstname(String firstname) {
    this.firstname = firstname;
  }

  public String getLastname() {
    return lastname;
  }

  public void setLastname(String lastname) {
    this.lastname = lastname;
  }

  public Date getDateofbirth() {
    return dateofbirth;
  }

  public void setDateofbirth(Date dateofbirth) {
    this.dateofbirth = dateofbirth;
  }

  public String getModeofemployment() {
    return modeofemployment;
  }

  public void setModeofemployment(String modeofemployment) {
    this.modeofemployment = modeofemployment;
  }

  public String getBusinessunit() {
    return businessunit;
  }

  public void setBusinessunit(String businessunit) {
    this.businessunit = businessunit;
  }

  public String getL1manager() {
    return l1manager;
  }

  public void setL1manager(String l1manager) {
    this.l1manager = l1manager;
  }

  public String getL2manager() {
    return l2manager;
  }

  public void setL2manager(String l2manager) {
    this.l2manager = l2manager;
  }


public String getCoemanager() {
    return coemanager;
  }

  public void setCoemanager(String coemanager) {
    this.coemanager = coemanager;
  }

  public String getCoeskills() {
    return coeskills;
  }

  public void setCoeskills(String coeskills) {
    this.coeskills = coeskills;
  }

  public String getDesignation() {
    return designation;
  }

  public void setDesignation(String designation) {
    this.designation = designation;
  }

  public String getEmploymentstatus() {
    return employmentstatus;
  }

  public void setEmploymentstatus(String employmentstatus) {
    this.employmentstatus = employmentstatus;
  }

  public Date getProbationreviewdate() {
    return probationreviewdate;
  }

  public void setProbationreviewdate(Date probationreviewdate) {
    this.probationreviewdate = probationreviewdate;
  }

  public Date getDateofjoining() {
    return dateofjoining;
  }

  public void setDateofjoining(Date dateofjoining) {
    this.dateofjoining = dateofjoining;
  }

  public Date getDateofleaving() {
    return dateofleaving;
  }

  public void setDateofleaving(Date dateofleaving) {
    this.dateofleaving = dateofleaving;
  }

  public int getPreviousexperience() {
    return previousexperience;
  }

  public void setPreviousexperience(int previousexperience) {
    this.previousexperience = previousexperience;
  }

  public long getWorktelephonenumber() {
    return worktelephonenumber;
  }

  public void setWorktelephonenumber(long worktelephonenumber) {
    this.worktelephonenumber = worktelephonenumber;
  }

  public int getExtension() {
    return extension;
  }

  public void setExtension(int extension) {
    this.extension = extension;
  }

  public long getFax() {
    return fax;
  }

  public void setFax(long fax) {
    this.fax = fax;
  }

  public String getDivision() {
    return division;
  }

  public void setDivision(String division) {
    this.division = division;
  }

  public String getPaytype() {
    return paytype;
  }

  public void setPaytype(String paytype) {
    this.paytype = paytype;
  }

  public Time getLogintime() {
    return logintime;
  }

  public void setLogintime(Time logintime) {
    this.logintime = logintime;
  }

  public Time getLogouttime() {
    return logouttime;
  }

  public void setLogouttime(Time logouttime) {
    this.logouttime = logouttime;
  }

  public int getWrokinghours() {
    return wrokinghours;
  }

  public void setWrokinghours(int wrokinghours) {
    this.wrokinghours = wrokinghours;
  }

  public String getBandtype() {
    return bandtype;
  }

  public void setBandtype(String bandtype) {
    this.bandtype = bandtype;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getEmpid() {
    return empid;
  }

  public void setEmpid(String empid) {
    this.empid = empid;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getRole() {
    return role;
  }

  public void setRole(String role) {
    this.role = role;
  }

  public String getDepartment() {
    return department;
  }

  public void setDepartment(String department) {
    this.department = department;
  }

  public String getMobile() {
    return mobile;
  }

  public void setMobile(String mobile) {
    this.mobile = mobile;
  }


}

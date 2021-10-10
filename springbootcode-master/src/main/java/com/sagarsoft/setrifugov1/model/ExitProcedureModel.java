package com.sagarsoft.setrifugov1.model;

import javax.persistence.*;

@Entity
@Table(name = "exit_procedures")
public class ExitProcedureModel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column
    private int id;
    @Column
    private String empname;
    @Column
    private String empid;
    @Column
    private String bussinessunit;
    @Column
    private String department;
    @Column
    private String exittype;
    @Column
    private String overallstatus;
    @Column
    private String individualstatus;
    @Column
    private String initiateddate;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmpname() {
        return empname;
    }

    public void setEmpname(String empname) {
        this.empname = empname;
    }

    public String getEmpid() {
        return empid;
    }

    public void setEmpid(String empid) {
        this.empid = empid;
    }

    public String getBussinessunit() {
        return bussinessunit;
    }

    public void setBussinessunit(String bussinessunit) {
        this.bussinessunit = bussinessunit;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getExittype() {
        return exittype;
    }

    public void setExittype(String exittype) {
        this.exittype = exittype;
    }

    public String getOverallstatus() {
        return overallstatus;
    }

    public void setOverallstatus(String overallstatus) {
        this.overallstatus = overallstatus;
    }

    public String getIndividualstatus() {
        return individualstatus;
    }

    public void setIndividualstatus(String individualstatus) {
        this.individualstatus = individualstatus;
    }

    public String getInitiateddate() {
        return initiateddate;
    }

    public void setInitiateddate(String initiateddate) {
        this.initiateddate = initiateddate;
    }
}

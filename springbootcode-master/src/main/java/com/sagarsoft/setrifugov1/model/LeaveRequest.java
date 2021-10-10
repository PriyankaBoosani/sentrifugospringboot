package com.sagarsoft.setrifugov1.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity

public class LeaveRequest {
  
  @Id
  @GeneratedValue(strategy=GenerationType.IDENTITY)
  @Column
  private int leaveRequestId;
  @Column
  private String empId;
  @Column
  private int availableLeaves;
  @Column
  private String reason;
  @Column
  private String leaveFor;
  @Column
  private String leaveType;
  @Column
  private String fromDate;
  @Column
  private String toDate;
  @Column
  private int days;
  @Column
  private String reportingManager;
  @Column
  private String appliedOn;


    public int getLeaveRequestId() {
        return leaveRequestId;
    }

    public void setLeaveRequestId(int leaveRequestId) {
        this.leaveRequestId = leaveRequestId;
    }

    public String getEmpId() {
        return empId;
    }

    public void setEmpId(String empId) {
        this.empId = empId;
    }

    public int getAvailableLeaves() {
        return availableLeaves;
    }

    public void setAvailableLeaves(int availableLeaves) {
        this.availableLeaves = availableLeaves;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public String getLeaveFor() {
        return leaveFor;
    }

    public void setLeaveFor(String leaveFor) {
        this.leaveFor = leaveFor;
    }

    public String getLeaveType() {
        return leaveType;
    }

    public void setLeaveType(String leaveType) {
        this.leaveType = leaveType;
    }

    public String getFromDate() {
        return fromDate;
    }

    public void setFromDate(String fromDate) {
        this.fromDate = fromDate;
    }

    public String getToDate() {
        return toDate;
    }

    public void setToDate(String toDate) {
        this.toDate = toDate;
    }

    public int getDays() {
        return days;
    }

    public void setDays(int days) {
        this.days = days;
    }

    public String getReportingManager() {
        return reportingManager;
    }

    public void setReportingManager(String reportingManager) {
        this.reportingManager = reportingManager;
    }

    public String getAppliedOn() {
        return appliedOn;
    }

    public void setAppliedOn(String appliedOn) {
        this.appliedOn = appliedOn;
    }

    public LeaveRequest(int leaveRequestId, String empId, int availableLeaves, String reason, String leaveFor,
                        String leaveType, String fromDate, String toDate, int days, String reportingManager, String appliedOn) {
 super();
 this.leaveRequestId = leaveRequestId;
 this.empId = empId;
 this.availableLeaves = availableLeaves;
 this.reason = reason;
 this.leaveFor = leaveFor;
 this.leaveType = leaveType;
 this.fromDate = fromDate;
 this.toDate = toDate;
 this.days = days;
 this.reportingManager = reportingManager;
 this.appliedOn = appliedOn;
}


public LeaveRequest() {
 
}


}

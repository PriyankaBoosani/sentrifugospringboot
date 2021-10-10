package com.sagarsoft.setrifugov1.model;

import java.time.LocalDate;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@NoArgsConstructor
@AllArgsConstructor

@Getter
@Setter
@Entity
@Table
public class MyLeaveRequests {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private int availableLeaves;
	private String reason;
	private String leaveFor;
	private String leaveType;
	private LocalDate fromDate;
	private LocalDate toDate;
	private int days;
	

}

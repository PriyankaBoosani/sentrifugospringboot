package com.sagarsoft.setrifugov1.model;

import javax.persistence.Column;
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
@Table(name="conferencebooking")
public class ConferenceBooking {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column
	private int slNo;
	@Column
	private String conferenceRoom;
	@Column
	private String begin;
	@Column
	private String end;
	@Column
	private String repeatBooking;
	@Column
	private String attendees;
	@Column
	private String status;
	
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	@Column
	private String bookedBy;
	public String getBookedBy() {
		return bookedBy;
	}
	public void setBookedBy(String bookedBy) {
		this.bookedBy = bookedBy;
	}
	public int getSlNo() {
		return slNo;
	}
	public void setSlNo(int slNo) {
		this.slNo = slNo;
	}
	public String getConferenceRoom() {
		return conferenceRoom;
	}
	public void setConferenceRoom(String conferenceRoom) {
		this.conferenceRoom = conferenceRoom;
	}
	public String getBegin() {
		return begin;
	}
	public void setBegin(String begin) {
		this.begin = begin;
	}
	public String getEnd() {
		return end;
	}
	public void setEnd(String end) {
		this.end = end;
	}
	
	public String getRepeatBooking() {
		return repeatBooking;
	}
	public void setRepeatBooking(String repeatBooking) {
		this.repeatBooking = repeatBooking;
	}
	public String getAttendees() {
		return attendees;
	}
	public void setAttendees(String attendees) {
		this.attendees = attendees;
	}
	
	
	

}

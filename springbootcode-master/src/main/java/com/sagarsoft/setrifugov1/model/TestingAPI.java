package com.sagarsoft.setrifugov1.model;

import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoUnit;
import java.time.temporal.Temporal;
import java.util.Date;

public class TestingAPI {
	
	public static void main(String [] args) {
		
		Date d1 = new Date();
		LocalDate d2 = LocalDate.of(2017, Month.MAY, 24);
		int no = (int) ChronoUnit.DAYS.between(d2, (Temporal) d1);
		System.out.println(no);
	}

}

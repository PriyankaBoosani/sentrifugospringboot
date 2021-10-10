package com.sagarsoft.setrifugov1.Dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sagarsoft.setrifugov1.model.MyHolidayCalendar;

public interface MyHolidayListDAO extends JpaRepository<MyHolidayCalendar, Integer> {

}

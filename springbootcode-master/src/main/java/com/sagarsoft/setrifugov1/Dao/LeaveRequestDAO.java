package com.sagarsoft.setrifugov1.Dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sagarsoft.setrifugov1.model.LeaveRequest;
import org.springframework.stereotype.Repository;

@Repository
public interface LeaveRequestDAO extends JpaRepository<LeaveRequest, Integer>{

}
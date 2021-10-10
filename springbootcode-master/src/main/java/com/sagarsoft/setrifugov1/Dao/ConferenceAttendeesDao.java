package com.sagarsoft.setrifugov1.Dao;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sagarsoft.setrifugov1.model.ConferenceAttendees;
@Repository
@Transactional
public interface ConferenceAttendeesDao extends JpaRepository<ConferenceAttendees, Integer> {

}

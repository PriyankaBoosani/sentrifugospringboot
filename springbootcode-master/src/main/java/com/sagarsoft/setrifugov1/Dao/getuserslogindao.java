package com.sagarsoft.setrifugov1.Dao;

import com.sagarsoft.setrifugov1.model.usermodel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Repository
@Transactional
public interface getuserslogindao extends JpaRepository <usermodel, Integer>{
    @Query(value = "Select bl from usermodel bl where bl.email=?1 or bl.empid=?1")
    usermodel getUserLogin(String username);
    @Query(value = "Select bm from usermodel bm where bm.email=?1 or bm.empid=?1 and bm.password=?2")
    usermodel findByUserNameAndPassword(String username,  String password);
    @Query(value = "Select * from usermodel bm where bm.id=?1", nativeQuery=true)
    usermodel getbyId(int id);
    usermodel findById(int id);
}

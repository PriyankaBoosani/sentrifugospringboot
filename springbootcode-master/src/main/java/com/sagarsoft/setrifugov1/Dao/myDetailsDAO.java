package com.sagarsoft.setrifugov1.Dao;

import org.springframework.data.jpa.repository.JpaRepository;
import com.sagarsoft.setrifugov1.model.MyDetails;
import org.springframework.stereotype.Repository;

@Repository
public interface myDetailsDAO  extends JpaRepository<MyDetails,Integer>{
  
  

}

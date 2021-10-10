package com.sagarsoft.setrifugov1.Dao;

import com.sagarsoft.setrifugov1.model.ServiceRequestList;
import com.sagarsoft.setrifugov1.model.usermodel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DashboardDAO extends JpaRepository<usermodel, Integer> {

    @Query(value = "Select * from main bm where bm.postingdate=DATE(NOW()) and bm.imloanstypeid=1", nativeQuery=true)
    List<usermodel> getLoansDetailsToday();
}

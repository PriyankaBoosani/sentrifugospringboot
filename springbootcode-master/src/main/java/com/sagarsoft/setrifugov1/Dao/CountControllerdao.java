package com.sagarsoft.setrifugov1.Dao;

import com.sagarsoft.setrifugov1.model.ServiceRequestList;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface CountControllerdao extends JpaRepository<ServiceRequestList, Integer>  {

    @Query(value = "SELECT  count(*) from service_request_list bm where bm.status='closed'", nativeQuery=true)
    int getCountofClosed();
    @Query(value = "SELECT  count(*) from service_request_list", nativeQuery=true)
    int getAllcount();
    @Query(value = "SELECT  count(*) from service_request_list bm where bm.status='cancelled'", nativeQuery=true)
    int getCancount();
    @Query(value = "SELECT  count(*) from service_request_list bm where bm.status='open'", nativeQuery=true)
    int getCountofopen();
    @Query(value = "SELECT  count(*) from service_request_list bm where bm.status='rejected'", nativeQuery=true)
    int getCountofRejected();
    @Query(value = "SELECT  count(*) from leave_request bm", nativeQuery=true)
    int getCountofallleaves();
    @Query(value = "SELECT  count(*) from leave_request bm where bm.status='Rejected'", nativeQuery=true)
    int getCountofrejleaves();
    @Query(value = "SELECT  count(*) from leave_request bm where bm.status='Approved'", nativeQuery=true)
    int getCountofappleaves();
    @Query(value = "SELECT  count(*) from leave_request bm where bm.status='Cancelled'", nativeQuery=true)
    int getCountofcancleaves();
    @Query(value = "SELECT  count(*) from leave_request bm where bm.status='Pending'", nativeQuery=true)
    int getCountofpenleaves();
}

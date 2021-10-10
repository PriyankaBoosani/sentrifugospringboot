package com.sagarsoft.setrifugov1.Controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sagarsoft.setrifugov1.Dao.LeaveRequestDAO;
import com.sagarsoft.setrifugov1.model.LeaveRequest;


@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/leave")
public class LeaveRequestController {
 
 @Autowired
 LeaveRequestDAO leaveRequestDAO;
 
 @PostMapping("/request")
 public LeaveRequest insertLeaveRequest(@RequestBody LeaveRequest leaveRequest) {
  return leaveRequestDAO.save(leaveRequest);
  
 }
    
 @GetMapping("/details")
    public ResponseEntity<List<LeaveRequest>> getAllLeaves(){
        return ResponseEntity.ok(leaveRequestDAO.findAll());
    }
 
// / Method to get service request by status 
 public LeaveRequest getByStatus(String empId) {
   
   LeaveRequest leaves = (LeaveRequest) leaveRequestDAO.findAll().stream().filter(t -> empId.equalsIgnoreCase(t.getEmpId())).findFirst().orElse(null);
   
   return leaves;
  }
 
// // API to get service request by status
 @RequestMapping(value="/leaves/{empId}")
 public LeaveRequest getByStat(@PathVariable String empId) {
  return getByStatus(empId);
 }
 
 
 

}

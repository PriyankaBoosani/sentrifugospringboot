package com.sagarsoft.setrifugov1.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.sagarsoft.setrifugov1.Dao.myDetailsDAO;
import com.sagarsoft.setrifugov1.model.MyDetails;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api")
public class GetMyDetails {
  
  @Autowired
  myDetailsDAO mydetailsDAO;
  //get Employee By ID
      @CrossOrigin(origins = "*")
        @GetMapping("/mydetails/{id}")
    public MyDetails getStudentById(@PathVariable("id") int id) {
      return mydetailsDAO.getById(id);
      
    }
}

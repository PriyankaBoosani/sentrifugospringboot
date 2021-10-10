package com.sagarsoft.setrifugov1.Controller;

import com.sagarsoft.setrifugov1.Dao.DashboardDAO;
import com.sagarsoft.setrifugov1.model.usermodel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/dashboard")
public class DashboardController {
    @Autowired
    DashboardDAO dashboardDAO;

    @CrossOrigin(origins = "*")
    @GetMapping("/listemployees")
    public List<usermodel> allusers () {
        return dashboardDAO.findAll();
    }

}

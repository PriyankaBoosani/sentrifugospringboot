package com.sagarsoft.setrifugov1.Controller;

import com.sagarsoft.setrifugov1.Dao.ExitProceduresdao;
import com.sagarsoft.setrifugov1.Dao.GetProjectsdao;
import com.sagarsoft.setrifugov1.Dao.getuserslogindao;
import com.sagarsoft.setrifugov1.model.ExitProcedureModel;
import com.sagarsoft.setrifugov1.model.ProjectModel;
import com.sagarsoft.setrifugov1.model.usermodel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/hr")
public class HrModuleController {
    @Autowired
    getuserslogindao users;
    @Autowired
    GetProjectsdao getProjectsdao;
    @Autowired
    ExitProceduresdao exitProceduresdao;

    @CrossOrigin(origins = "*")
    @GetMapping("/listemployees")
    public List<usermodel> allusers () {
        return users.findAll();
    }

    @CrossOrigin(origins = "*")
    @GetMapping("/getdetails/{id}")
    public usermodel get(@PathVariable int id) {
        Optional<usermodel> employees = Optional.ofNullable(users.findById(id));
        if(employees.isPresent()) {
            return employees.get();
        }else {
            throw new RuntimeException("Employee with the code not present"+ id);
        }
    }

    @CrossOrigin(origins = "*")
    @GetMapping("/allprojects")
    public List<ProjectModel> allprojects () {
        return getProjectsdao.findAll();
    }

    @CrossOrigin(origins = "*")
    @GetMapping("/allexitproc")
    public List<ExitProcedureModel> allexitproc () {
        return exitProceduresdao.findAll();
    }

    @CrossOrigin(origins = "*")
    @PostMapping("/createexitproc")
    public ExitProcedureModel exitProcedureModel(@RequestBody ExitProcedureModel emp) {
        return exitProceduresdao.save(emp);
    }
    @CrossOrigin(origins = "*")
    @GetMapping("/getexitdetails/{id}")
    public ExitProcedureModel getsilid(@PathVariable int id) {
        Optional<ExitProcedureModel> exitprocmodel = Optional.ofNullable(exitProceduresdao.findById(id));
        if(exitprocmodel.isPresent()) {
            return exitprocmodel.get();
        }else {
            throw new RuntimeException("Employee with the code not present"+ id);
        }
    }

}

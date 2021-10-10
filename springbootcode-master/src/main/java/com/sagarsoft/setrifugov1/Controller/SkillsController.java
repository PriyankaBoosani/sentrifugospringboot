package com.sagarsoft.setrifugov1.Controller;

import com.sagarsoft.setrifugov1.Dao.Skillsdao;
import com.sagarsoft.setrifugov1.model.SkillsModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/selfservice")
public class SkillsController {
    @Autowired
    Skillsdao skillsdao;

    @CrossOrigin(origins = "*")
    @GetMapping("/allskills")
    public List<SkillsModel> allusers () {
        return skillsdao.findAll();
    }
}

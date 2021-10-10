package com.sagarsoft.setrifugov1.Controller;


import com.sagarsoft.setrifugov1.Dao.CountControllerdao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/count")
public class CountController {
    @Autowired
    CountControllerdao countControllerdao;

    @CrossOrigin(origins = "*")
    @GetMapping(path = "/opencount")
    public int opencount() {
        int x = countControllerdao.getCountofopen();
        return x;
    }

    @CrossOrigin(origins = "*")
    @GetMapping(path = "/closedcount")
    public int clousedCount() {
        int x = countControllerdao.getCountofClosed();
        return x;
    }

    @CrossOrigin(origins = "*")
    @GetMapping(path = "/rejectedcount")
    public int rejectedcount() {
        int x = countControllerdao.getCountofRejected();
        return x;
    }
    @CrossOrigin(origins = "*")
    @GetMapping(path = "/allleavescount")
    public int Allleaves() {
        int x = countControllerdao.getCountofallleaves();
        return x;
    }

    @CrossOrigin(origins = "*")
    @GetMapping(path = "/rejleavescount")
    public int Rejectedleaves() {
        int x = countControllerdao.getCountofrejleaves();
        return x;
    }
    @CrossOrigin(origins = "*")
    @GetMapping(path = "/appleavescount")
    public int Approvedleaves() {
        int x = countControllerdao.getCountofappleaves();
        return x;
    }

    @CrossOrigin(origins = "*")
    @GetMapping(path = "/canleavescount")
    public int Cancelledleaves() {
        int x = countControllerdao.getCountofcancleaves();
        return x;
    }

    @CrossOrigin(origins = "*")
    @GetMapping(path = "/penleavescount")
    public int PendingLeaves() {
        int x = countControllerdao.getCountofpenleaves();
        return x;
    }

    @CrossOrigin(origins = "*")
    @GetMapping(path = "/allcount")
    public int Allcount() {
        int x = countControllerdao.getAllcount();
        return x;
    }

    @CrossOrigin(origins = "*")
    @GetMapping(path = "/cancount")
    public int Cancount() {
        int x = countControllerdao.getCancount();
        return x;
    }
}

package com.sagarsoft.setrifugov1.Controller;


import com.sagarsoft.setrifugov1.Dao.getuserslogindao;
import com.sagarsoft.setrifugov1.model.UserRequest;
import com.sagarsoft.setrifugov1.model.usermodel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/auth")
public class userloginController {
    //Declare Password Encoding Details
    private final PasswordEncoder passwordEncoder;
    //Creating a Response Object
    ResponseObject<String> responseObject = null;
    @Autowired
    getuserslogindao loginDao;

    public userloginController(PasswordEncoder passwordEncoder) {
        this.passwordEncoder = passwordEncoder;
    }



    @CrossOrigin(origins = "*")
    @PostMapping(path = "/user/login")
    public ResponseObject<String> Login(@RequestBody UserRequest vr) {
        usermodel ad = loginDao.getUserLogin(vr.getUsername());
        if (ad == null) {
            return responseObject = new  ResponseObject<>(403, "NoData");

        }
        String db_pw = ad.getPassword();
        Boolean if_pw_matched = passwordEncoder.matches(vr.getPassword(), db_pw); ///////// ENCODING STRING PASSWORD
        System.out.println("PASSWORD from DB::: " + db_pw);
        System.out.println("PASSWORD from REQ::: " + vr.getPassword());
        String pw = "";

        if (if_pw_matched) {
            pw = db_pw;

        }
        System.out.println("Output of the pawssord matcher " + if_pw_matched);

        usermodel llist1 = loginDao.findByUserNameAndPassword(vr.getUsername(), pw);
        System.out.println("LLSIT 1 out is as follows" + llist1);
        if (llist1 == null) {
            return responseObject = new ResponseObject<>(404, "ERROR");
        }
        return responseObject = new ResponseObject<>(200, "OK");
    }
}

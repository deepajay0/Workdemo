package com.test.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class TouristController {

        @GetMapping("/")
        public String homeLogin(){
            return "Login";
        }
        @PostMapping("/login")
        public String doLogin(@RequestParam("email")String emailId,@RequestParam("password")String password){
            System.out.println("login handler called");
            System.out.println("emailid is "+emailId);
            System.out.println("password is "+password);

            return "Home";
        }
}

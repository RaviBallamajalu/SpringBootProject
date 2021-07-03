package com.test.test.controller;

import com.test.test.model.MyStudent;
import com.test.test.service.MyService;
import com.test.test.service.impl.MyServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/MyController")
@Slf4j
public class MyController {
    @Autowired
    private MyServiceImpl myService;

    @GetMapping("/welcome")
    public String myFirstMethod(){
        String s="WELCOME";
        log.info("Welcome To My Repository");
         return  s;
    }

    @GetMapping("/getStudent/{id}")
    public MyStudent getStudent(@PathVariable Integer id)
    {
        return myService.getMyStudentById(id);
    }
}

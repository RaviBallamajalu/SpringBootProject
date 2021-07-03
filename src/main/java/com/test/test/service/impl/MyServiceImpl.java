package com.test.test.service.impl;

import com.test.test.model.MyStudent;
import com.test.test.repository.MyRepository;
import com.test.test.service.MyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MyServiceImpl implements MyService {
    @Autowired
    private MyRepository myRepository;

    @Override
    public MyStudent getMyStudentById(Integer id) {
        MyStudent myStudent= myRepository.getById(id);
        return  myStudent;
    }
}

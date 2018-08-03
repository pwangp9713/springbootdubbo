/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo;

import com.example.demo.domain.Course;
import com.example.demo.domain.Grade;
import com.example.demo.domain.Student;
import com.example.demo.mapper.DubboService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author root
 */
@RestController
public class DubboController {
    @Autowired
    DubboService dm;
    
    @RequestMapping("/hahaha1")
    public Student hahaha1(String sname){
        return dm.hahaha1(sname);
    }
    
    @RequestMapping("/hahaha2")
    public Course hahaha2(String cname){
        return dm.hahaha2(cname);
    }
    
    @RequestMapping("/hahaha3")
    public List<Grade> hahaha3(String sname){
        return dm.hahaha3(sname);
    }
    
    @RequestMapping("/hahaha4")
    public List<Grade> hahaha4(String cname){
        return dm.hahaha4(cname);
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo.mapper;

import com.alibaba.dubbo.config.annotation.Reference;
import com.example.demo.domain.Course;
import com.example.demo.domain.Grade;
import com.example.demo.domain.Student;
import java.util.List;
import org.springframework.stereotype.Component;

/**
 *
 * @author root
 */
@Component
public class DubboService {
    @Reference(version = "1.0.0")
    DubboMapper dm;
    
    public Student hahaha1(String sname){
        return dm.findstudentall(sname);
    }
    
    public Course hahaha2(String cname){
        return dm.findcourseall(cname);
    }
    
    public List<Grade> hahaha3(String sname){
        return dm.findstudentgrade(sname);
    }
    
    public List<Grade> hahaha4(String cname){
        return dm.findcoursegrade(cname);
    }
}

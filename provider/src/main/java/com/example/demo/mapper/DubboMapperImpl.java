/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo.mapper;

import com.alibaba.dubbo.config.annotation.Service;
import com.example.demo.domain.Course;
import com.example.demo.domain.Grade;
import com.example.demo.domain.Student;
import java.util.List;

/**
 *
 * @author root
 */
@Service(version = "1.0.0")
public class DubboMapperImpl implements DubboMapper{

    CourseMapper cm;
    StudentMapper sm;
    GradeMapper gm;
    MajorMapper mm;
    
    public DubboMapperImpl(CourseMapper cm, StudentMapper sm, GradeMapper gm, MajorMapper mm){
        this.cm=cm;
        this.sm=sm;
        this.gm=gm;
        this.mm=mm;
    }
    
    @Override
    public Student findstudentall(String sname) {
        return sm.selectstudentall(sname);
    }

    @Override
    public Course findcourseall(String cname) {
        return cm.selectcourseall(cname);
    }

    @Override
    public List<Grade> findcoursegrade(String cname) {
        return gm.selectgradebycourse(cname);
    }

    @Override
    public List<Grade> findstudentgrade(String sname) {
        return gm.selectgradebystudent(sname);
    }
    
}

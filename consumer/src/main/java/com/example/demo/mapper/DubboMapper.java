/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo.mapper;

import com.example.demo.domain.Course;
import com.example.demo.domain.Grade;
import com.example.demo.domain.Student;
import java.util.List;

/**
 *
 * @author root
 */
public interface DubboMapper {
    Student findstudentall(String sname);
    Course findcourseall(String cname);
    List<Grade> findcoursegrade(String cname);
    List<Grade> findstudentgrade(String sname);
}

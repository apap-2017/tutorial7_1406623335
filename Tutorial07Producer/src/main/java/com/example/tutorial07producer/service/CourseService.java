package com.example.tutorial07producer.service;

import java.util.List;

import com.example.tutorial07producer.model.CourseModel;

public interface CourseService
{    
    CourseModel selectCourse (String id);
    
    List<CourseModel> selectAllCourses ();
}

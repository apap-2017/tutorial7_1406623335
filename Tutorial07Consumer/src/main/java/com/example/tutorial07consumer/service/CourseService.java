package com.example.tutorial07consumer.service;

import java.util.List;

import com.example.tutorial07consumer.model.CourseModel;

public interface CourseService
{    
    CourseModel selectCourse (String id);
    
    List<CourseModel> selectAllCourses ();
}

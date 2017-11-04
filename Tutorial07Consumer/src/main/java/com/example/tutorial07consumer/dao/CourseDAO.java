package com.example.tutorial07consumer.dao;

import java.util.List;

import com.example.tutorial07consumer.model.CourseModel;

public interface CourseDAO {
	CourseModel selectCourse (String id);
	List<CourseModel> selectAllCourses();

}

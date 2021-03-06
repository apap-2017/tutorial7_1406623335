package com.example.tutorial07consumer.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.example.tutorial07consumer.model.CourseModel;

@Service
public class CourseDAOImpl implements CourseDAO {
	
	@Autowired
	private RestTemplate restTemplate;
	
	@Bean
	public RestTemplate restTemplate() {
		return new RestTemplate();
	}
	
	@Override
	public CourseModel selectCourse(String id) {
		// TODO Auto-generated method stub
		CourseModel course = restTemplate.getForObject("http://localhost:8080/rest/course/view/"+id,CourseModel.class);
		return course;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<CourseModel> selectAllCourses() {
		// TODO Auto-generated method stub
		List<CourseModel> courses = restTemplate.getForObject("http://localhost:8080/rest/course/viewall",List.class);
		return courses;
	}

}

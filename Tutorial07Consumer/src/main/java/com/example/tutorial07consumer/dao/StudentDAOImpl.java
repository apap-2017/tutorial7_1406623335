package com.example.tutorial07consumer.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.example.tutorial07consumer.dao.StudentDAO;
import com.example.tutorial07consumer.model.StudentModel;

@Service
public class StudentDAOImpl implements StudentDAO {
	@Autowired
	private RestTemplate restTemplate;
	
	/*@Bean
	public RestTemplate restTemplate() {
		return new RestTemplate();
	}*/
	
	@Override
	public StudentModel selectStudent(String npm) {
		StudentModel student = restTemplate.getForObject("http://localhost:8080/rest/student/view/"+npm,StudentModel.class);
		return student;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<StudentModel> selectAllStudents() {
		// TODO Auto-generated method stub
		List<StudentModel> students = restTemplate.getForObject("http://localhost:8080/rest/student/viewall",List.class);
		return students;
	}
}

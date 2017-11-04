package com.example.tutorial07consumer.dao;

import java.util.List;

import com.example.tutorial07consumer.model.StudentModel;

public interface StudentDAO {
	StudentModel selectStudent (String npm);
	List<StudentModel> selectAllStudents();
}

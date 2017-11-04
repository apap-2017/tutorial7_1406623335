package com.example.tutorial07producer.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.tutorial07producer.dao.CourseMapper;
import com.example.tutorial07producer.model.CourseModel;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class CourseServiceDatabase implements CourseService
{
    @Autowired
    private CourseMapper courseMapper;

	@Override
	public CourseModel selectCourse(String id) {
		
		return courseMapper.selectCourseStudent(id);
	}

    @Override
    public List<CourseModel> selectAllCourses ()
    {
        log.info("select all courses");
        return courseMapper.selectAllCourses ();
    }
}

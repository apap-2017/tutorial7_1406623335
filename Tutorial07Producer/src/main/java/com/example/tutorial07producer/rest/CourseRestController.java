package com.example.tutorial07producer.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.tutorial07producer.model.CourseModel;
import com.example.tutorial07producer.service.CourseService;

@RestController
@RequestMapping("/rest")
public class CourseRestController {

	@Autowired
	CourseService courseService;
	
	@RequestMapping("/course/view/{id}")
	public CourseModel view (@PathVariable(value = "id") String id) {
		CourseModel course = courseService.selectCourse(id);
		return course;
	}
	

    @RequestMapping("/course/viewall")
    public List<CourseModel> view (Model model)
    {
        List<CourseModel> courses = courseService.selectAllCourses ();
        model.addAttribute ("courses", courses);

        return courses;
    }
}

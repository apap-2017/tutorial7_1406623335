package com.example.tutorial07producer.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Many;

import com.example.tutorial07producer.model.CourseModel;
import com.example.tutorial07producer.model.StudentModel;

@Mapper
public interface CourseMapper
{
    /*----------*/
    @Select("select id_course, name, credits from course where id_course = #{id}")
    @Results(value = {
    		@Result(property="idCourse",column="id_course"),
    		@Result(property="name",column="name"),
    		@Result(property="credits",column="credits"),
    		@Result(property="students",column="id_course", javaType = List.class, many = @Many(select="selectStudentCourse"))
    })
    CourseModel selectCourseStudent (@Param("id") String id);
    ///////
    
    @Select("select id_course, name, credits from course")
    @Results(value = {
    		@Result(property = "idCourse", column = "id_course"),
    		@Result(property = "name", column = "name"),
    		@Result(property = "credits", column = "credits"),
    		@Result(property = "students", column = "id_course", javaType = List.class, many = @Many(select = "selectStudentCourse"))
    })
    List<CourseModel> selectAllCourses();
    
    /*----------*/
    @Select("select name, student.npm from studentcourse join student on studentcourse.npm = student.npm where studentcourse.id_course = #{id}")
    List<StudentModel> selectStudentCourse (@Param("id") String id);
    ///////
    
    
}

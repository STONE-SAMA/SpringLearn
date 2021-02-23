package com.example.dao;

import com.example.bean.MyStudent;
import com.example.bean.Student;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface StudentDao {
    int insertStudent(Student student);
    List<Student> selectStudents();

    List<Student> selectMutipleParam(@Param("myname") String name,
                                     @Param("myage") Integer age);

    /**
     * 使用resultMap定义映射关系
     */
    List<Student> selectAllStudents();

    List<MyStudent> selectMyStudent();

    List<MyStudent> selectMyStudentAnother();
}

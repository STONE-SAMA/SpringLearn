package com.example.dao;


import com.example.bean.Student;

import java.util.List;

public interface StudentDao {

    //动态sqk，使用java对象作为参数
    List<Student> selectStudentIf(Student student);
    //where使用
    List<Student> selectStudentWhere(Student student);

    //foreach
    //法1
    List<Student> selectStudentForeach1(List<Integer> list);
    //法2
    List<Student> selectStudentForeach2(List<Student> studentList);

    List<Student> selectAll();
}

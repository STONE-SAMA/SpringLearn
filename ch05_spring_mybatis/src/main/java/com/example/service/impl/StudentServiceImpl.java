package com.example.service.impl;

import com.example.dao.StudentDao;
import com.example.domain.Student;
import com.example.service.StudentService;

import java.util.List;

public class StudentServiceImpl implements StudentService {

    //引用类型dao
    private StudentDao studentDao;

    //使用set注入，赋值
    public void setStudentDao(StudentDao studentDao) {
        this.studentDao = studentDao;
    }

    @Override
    public int addStudent(Student student) {
        int nums = studentDao.insertStudent(student);
        return nums;
    }

    @Override
    public List<Student> queryStudents() {
        List<Student> students = studentDao.selectStudents();
        return students;
    }
}

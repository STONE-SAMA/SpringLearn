package com.example;


import com.example.bean.Student;
import com.example.dao.StudentDao;
import com.example.utils.mybatisUtil;
import com.github.pagehelper.PageHelper;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;


public class AppTest 
{

    @Test
    public void testSelectStudentIf(){
        SqlSession sqlSession = mybatisUtil.getSqlSession();
        StudentDao dao = sqlSession.getMapper(StudentDao.class);

        Student student = new Student();
        student.setName("abc");
        student.setAge(20);
        List<Student> students = dao.selectStudentIf(student);
        for(Student stu:students){
            System.out.println(stu);
        }

    }

    @Test
    public void testSelectStudentWhere(){
        SqlSession sqlSession = mybatisUtil.getSqlSession();
        StudentDao dao = sqlSession.getMapper(StudentDao.class);

        Student student = new Student();
        //student.setName("abc");
        //student.setAge(18);
        List<Student> students = dao.selectStudentWhere(student);
        for(Student stu:students){
            System.out.println(stu);
        }

    }

    @Test
    public void testSelectStudentForEach1(){
        SqlSession sqlSession = mybatisUtil.getSqlSession();
        StudentDao dao = sqlSession.getMapper(StudentDao.class);

        List<Integer> list = new ArrayList<>();
        list.add(1001);
        list.add(1002);
        list.add(1003);

        List<Student> students = dao.selectStudentForeach1(list);
        for(Student stu:students){
            System.out.println(stu);
        }

    }

    @Test
    public void testSelectStudentForEach2(){
        SqlSession sqlSession = mybatisUtil.getSqlSession();
        StudentDao dao = sqlSession.getMapper(StudentDao.class);

        List<Student> list = new ArrayList<>();
        Student stu1 = new Student();
        stu1.setId(1003);
        list.add(stu1);
        Student stu2 = new Student();
        stu2.setId(1004);
        list.add(stu2);

        List<Student> students = dao.selectStudentForeach2(list);
        for(Student stu:students){
            System.out.println(stu);
        }

    }

    @Test
    public void testSelectAll(){
        SqlSession sqlSession = mybatisUtil.getSqlSession();
        StudentDao dao = sqlSession.getMapper(StudentDao.class);
        //加入pageHelper分页
        //pageNum第几页，从1开始
        //pageSize一页中有多少数据
        PageHelper.startPage(1,3);

        List<Student> students = dao.selectAll();

        for(Student stu:students){
            System.out.println(stu);
        }

    }

}

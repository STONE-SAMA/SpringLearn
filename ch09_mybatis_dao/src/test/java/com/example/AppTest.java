package com.example;

import com.example.bean.MyStudent;
import com.example.bean.Student;
import com.example.dao.StudentDao;
import com.example.utils.mybatisUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class AppTest 
{

    @Test
    public void testSelectAllStudent(){
        SqlSession sqlSession = mybatisUtil.getSqlSession();
        StudentDao dao = sqlSession.getMapper(StudentDao.class);

        List<Student> students = dao.selectAllStudents();
        for(Student stu : students){
            System.out.println(stu);
        }
        sqlSession.close();
    }

    @Test
    public void testSelectAllMyStudent(){
        SqlSession sqlSession = mybatisUtil.getSqlSession();
        StudentDao dao = sqlSession.getMapper(StudentDao.class);

        List<MyStudent> students = dao.selectMyStudent();

        for(MyStudent stu : students){
            System.out.println(stu);
        }
        sqlSession.close();
    }

    @Test
    public void testSelectAllMyStudentAnother(){
        SqlSession sqlSession = mybatisUtil.getSqlSession();
        StudentDao dao = sqlSession.getMapper(StudentDao.class);

        List<MyStudent> students = dao.selectMyStudentAnother();

        for(MyStudent stu : students){
            System.out.println(stu);
        }
        sqlSession.close();
    }
}

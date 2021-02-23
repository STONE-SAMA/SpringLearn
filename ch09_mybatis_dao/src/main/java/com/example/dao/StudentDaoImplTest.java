package com.example.dao;


import com.example.bean.Student;
import com.example.utils.mybatisUtil;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

public class StudentDaoImplTest {

    public int insertStudent(Student student) {
        return 0;
    }


    public List<Student> selectStudents() {
        //获取Sqlsession对象
        SqlSession sqlSession = mybatisUtil.getSqlSession();
        String sqlId = "com.example.dao.StudentDao.selectStudents";
        //执行sql语句
        List<Student> students = sqlSession.selectList(sqlId);
        //关闭
        sqlSession.close();
        return students;
    }
}

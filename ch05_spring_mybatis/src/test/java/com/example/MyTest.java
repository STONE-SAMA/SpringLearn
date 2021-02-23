package com.example;

import com.example.dao.StudentDao;
import com.example.domain.Student;
import com.example.service.StudentService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class MyTest {
    @Test
    public void test01(){
        String config = "applicationContext.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(config);
        String []names = ac.getBeanDefinitionNames();
        for(String name : names){
            System.out.println("对象名称：" + name);
        }

    }

    @Test
    public void testDaoInsert(){
        String config = "applicationContext.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(config);
        //获取spring容器中的dao对象
        StudentDao dao = (StudentDao) ac.getBean("studentDao");
        Student student = new Student();
        student.setId(1005);
        student.setName("test");
        student.setAge(23);
        int num = dao.insertStudent(student);
        System.out.println("num = " + num);
    }

    @Test
    public void testServiceInsert(){
        String config = "applicationContext.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(config);
        //获取spring容器中的dao对象
        StudentService service = (StudentService) ac.getBean("studentService");
        Student student = new Student();
        student.setId(1006);
        student.setName("abc");
        student.setAge(29);
        int num = service.addStudent(student);
        //事务自动提交，无需执行SqlSession.commit()
        System.out.println("num = " + num);
    }

    @Test
    public void testServiceSelect(){
        String config = "applicationContext.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(config);
        //获取spring容器中的dao对象
        StudentService service = (StudentService) ac.getBean("studentService");
        List<Student> students = service.queryStudents();
        for(Student stu : students){
            System.out.println(stu);
        }

    }
}

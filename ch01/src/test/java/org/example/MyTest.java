package org.example;

import beans.School;
import beans.Student;
import org.example.Services.Impl.MyServiceImpl;
import org.example.Services.MyService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.text.SimpleDateFormat;
import java.util.Date;

public class MyTest {

    @Test
    public void test01(){
        MyService service = new MyServiceImpl();
        service.doSome();
    }

    @Test
    public void test02(){
        //使用spring容器创建对象
        //1、指定spring配置文件的名称
        String config = "beans.xml";
        //2、创建表示spring容器的对象，ApplicationContext
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(config);
        //从容器中获取对象
        //getbean()中为配置文件中的bean的id
        MyService service = (MyService) applicationContext.getBean("myService");
        //使用spring创建好的对象
        service.doSome();

        //获取容器中定义的对象的数量
        int nums = applicationContext.getBeanDefinitionCount();
        //获取容器中定义的对象的名称
        String []names= applicationContext.getBeanDefinitionNames();

    }

    @Test
    public void test03(){
        String config = "beans.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(config);

        Date myDate = (Date) ac.getBean("myDate");
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        System.out.println( sdf.format(myDate));
    }

    @Test
    public void test04(){
        String config = "applicationContext.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(config);

        //Student myStudent = (Student) ac.getBean("myStudent");
        Student myStudent = (Student) ac.getBean("myStu");
        System.out.println(myStudent);
    }

//    @Test
//    public void test05(){
//        Student student = new Student();
//        student.setName("stu02");
//        student.setAge(23);
//        School school = new School();
//        school.setName("#####");
//        school.setAddress("*****");
//        student.setSchool(school);
//        System.out.println(student);
//    }


}

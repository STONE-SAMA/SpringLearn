package com.example.ba03;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("myStudent")
public class Student {
    /**
     * 简单类型赋值 @value
     * 位置：1、在属性定义上面，无需set
     *      2、在set方法上面
     */
    @Value("张三")
    private String name;
    @Value("32")
    private String age;

    /**
     * 引用类型
     * @autowired：spring框架提供的注解，实现引用类型的赋值
     * spring中通过注解给引用类型赋值，使用自动注入原理（byName、byType）
     *
     * 位置：1、在属性定义上，无需set方法
     *      2、在set放法上
     */
    @Autowired
    private School school;

    public Student() {
        System.out.println("student无参构造方法");
    }

    public String getName() {
        return name;
    }

//    public void setName(String name) {
//        this.name = name;
//    }

    public String getAge() {
        return age;
    }

//    public void setAge(String age) {
//        this.age = age;
//    }


    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                ", school=" + school +
                '}';
    }
}

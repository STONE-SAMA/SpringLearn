package org.example.ba05;

import org.example.ba02.Student;

public class SomeServiceImpl implements SomeService {

    @Override
    public void doSome(String name, Integer age) {
        System.out.println("=====目标方法doSome()=====");
    }

    @Override
    public String doOther(String name, Integer age) {
        System.out.println("=====目标方法doOther()=====");
        return "OK";
    }

    @Override
    public Student doStudent(String name, Integer age) {
        Student student = new Student();
        student.setName(name);
        student.setAge(age);
        return student;
    }

    @Override
    public String doFirst(String name, Integer age) {
        System.out.println("=====业务方法doFirst()=====");
        return "doFirst";
    }

    @Override
    public void doSecond() {
        System.out.println("=====业务方法doSecond()=====");
        //System.out.println(1/0);
    }

    @Override
    public void doThird() {
        System.out.println("=====业务方法doThird()=====");
    }
}

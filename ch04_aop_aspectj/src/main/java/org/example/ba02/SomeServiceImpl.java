package org.example.ba02;

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
}

package org.example;

import org.example.ba05.SomeService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest05 {
    @Test
    public void test01(){
        String config = "applicationContext.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(config);
        //从容器中获取目标对象
        SomeService proxy = (SomeService) ac.getBean("someService");
        //通过代理对象执行方法，实现功能增强
        proxy.doThird();
        //System.out.println("result = " + str);
    }

}

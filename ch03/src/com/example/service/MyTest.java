package com.example.service;

import com.example.handler.myIncationHandler;
import com.example.service.impl.myServiceImpl;
import com.example.service.myService;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class MyTest {
    public static void main(String[] args) {
//        myService service = new myServiceImpl();
//        service.doSome();
//        System.out.println("=======================");
//        service.doAnother();


        //使用jdk的proxy创建代理对象
        //创建目标对象
        myService target = new myServiceImpl();
        //创建InvocationHandler对象
        InvocationHandler handler = new myIncationHandler(target);
        //使用proxy创建代理
        myService proxy = (myService) Proxy.newProxyInstance(
                target.getClass().getClassLoader(),//第一个参数：哪个类加载器去加载对象
                target.getClass().getInterfaces(), //第二个参数：动态代理实现的接口
                handler);//第三个参数：执行其中的invoke方法
        //通过代理执行方法，调用handler中的invoke
        proxy.doSome();

    }
}

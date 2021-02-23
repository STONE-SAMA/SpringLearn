package org.example.ba01;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @Aspect:是aspectj中的注解
 * 表示当前类为切面类
 */
@Aspect
public class MyAspect {
    //定义方法
//    @Before(value = "execution(public void org.example.ba01.SomeServiceImpl.doSome(String,Integer))")
//    public void myBefore(){
//        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
//        String time = sdf.format(new Date());
//        System.out.println("前置通知，执行时间：" + time);
//    }

    /**
     * 指定方法中的参数：JoinPoint
     * JoinPoint：业务方法，要加入切面功能的业务方法
     *      作用：可以在通知方法中获取方法执行时的信息
     * JoinPoint参数的值由框架赋予，必须为第一个位置的参数
     */
    @Before(value = "execution(public void org.example.ba01.SomeServiceImpl.doSome(String,Integer))")
    public void myBefore(JoinPoint jp){
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        String time = sdf.format(new Date());
        System.out.println("前置通知，执行时间：" + time);
        System.out.println("方法签名:" + jp.getSignature());
        System.out.println("方法名:" + jp.getSignature().getName());
        //获取方法实参
        Object args[] = jp.getArgs();
        for(Object arg : args){
            System.out.println("参数：" + arg);
        }
    }

}

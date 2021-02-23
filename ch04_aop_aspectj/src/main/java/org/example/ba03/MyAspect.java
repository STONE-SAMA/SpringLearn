package org.example.ba03;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.example.ba02.Student;

import java.util.Date;

/**
 * @Aspect:是aspectj中的注解
 * 表示当前类为切面类
 */
@Aspect
public class MyAspect {
    /**
     * 环绕通知
     * 1、public
     * 2、必须有返回值，推荐object
     * 3、方法名称自定义
     * 4、方法有参数，固定参数ProceedingJoinPoint
     *
     * @Around
     * 属性：value切入点表达式
     * 特点：
     * 1、功能最强的通知
     * 2、在目标方法前后都能增强功能
     * 3、控制目标方法是否被执行
     * 4、修改目标方法的执行结果
     *
     * 环绕通知等同于jdk动态代理的InvocationHandler接口
     *  参数ProceedingJoinPoint等同于method
     *  作用：执行目标方法
     *  返回值：目标方法的执行结果，结果可以被修改
     */

    @Around(value = "execution(* *..SomeServiceImpl.doFirst(..))")
    public Object myAround(ProceedingJoinPoint pjp) throws Throwable {
        String name = "";
        //获取第一个参数
        Object args[] = pjp.getArgs();
        if(args != null && args.length > 1){
            Object arg = args[0];
            name = (String) arg;
        }

        //实现环绕通知
        Object result = null;
        System.out.println("环绕通知，目标方法之前：" + new Date());
        //1、目标方法调用
        if(name.equals("abc")){
            //符合条件使用目标方法
            result = pjp.proceed();//method.invoke();  Object result = doFirst();

        }
        //2、在目标方法前后增加功能
        System.out.println("环绕通知，目标方法之后，事务处理");
        //返回目标方法执行结果，可以修改返回结果
        return result;
    }



}

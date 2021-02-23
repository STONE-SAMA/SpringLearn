package org.example.ba02;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
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
    /**
     * 后置通知
     *  方法有参数，推荐object，参数名自定义
     *
     *  @AfterReturning
     *  属性：1、value切入点表达式
     *       2、returning 自定义变量，表示目标返回值
     *          自定义变量名必须与通知方法的形参相同
     *  特点：
     *  1、在目标方法后执行
     *  2、获取目标方法的返回值
     *  3、可以修改返回值
     */

    @AfterReturning(value = "execution(* *..SomeServiceImpl.doOther(..))",returning = "res")
    public void myAfterReturning(Object res){
        //Object res是目标方法执行后的返回值
        System.out.println("后置通知："+res);
    }

    @AfterReturning(value = "execution(* *..SomeServiceImpl.doStudent(..))",returning = "res")
    public void myStudentAfterReturning(Student res){
        //Object res是目标方法执行后的返回值
        System.out.println("后置通知："+res);
        if (res!=null){
            res.setName("张三");
            res.setAge(32);
        }

    }

}

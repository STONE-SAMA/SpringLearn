package org.example.ba06;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

/**
 * @Aspect:是aspectj中的注解
 * 表示当前类为切面类
 */
@Aspect
public class MyAspect {

    @AfterThrowing(value = "myPointcut()",
            throwing = "e")
    public void myAfterThrowing(Exception e){
        System.out.println("异常通知：方法抛出异常" + e.getMessage());
        //执行抛出异常时功能
    }

    @After(value = "myPointcut()")
    public void myAfter(){
        System.out.println("执行最终通知");
    }

    /**
     * 切入点表达式@Pointcut
     * 定义和管理切入点
     */

    @Pointcut(value = "execution(* *..SomeServiceImpl.doThird(..))")
    public void myPointcut(){
        //无需代码
    }

}

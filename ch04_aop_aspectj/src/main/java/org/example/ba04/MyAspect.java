package org.example.ba04;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;

import java.util.Date;

/**
 * @Aspect:是aspectj中的注解
 * 表示当前类为切面类
 */
@Aspect
public class MyAspect {
    /**
     * 异常通知
     * 1、public
     * 2、无返回值
     * 3、方法名自定义
     * 4、方法有Exception，还可以有JoinPoint
     *
     * @AfterThrowing
     * 属性：1、value切入表达式
     *      2、throwing自定义变量，变量名必须和方法名相同
     * 特点：
     * 1、在目标方法抛出异常时执行
     * 2、可以做异常监控程序
     *
     */

    @AfterThrowing(value = "execution(* *..SomeServiceImpl.doSecond(..))",
            throwing = "e")
    public void myAfterThrowing(Exception e){
        System.out.println("异常通知：方法抛出异常" + e.getMessage());
        //执行抛出异常时功能
    }

}

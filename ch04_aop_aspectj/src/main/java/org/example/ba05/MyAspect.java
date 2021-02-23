package org.example.ba05;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;

/**
 * @Aspect:是aspectj中的注解
 * 表示当前类为切面类
 */
@Aspect
public class MyAspect {
    /**
     * 最终通知
     * 1、public
     * 2、无返回值
     * 3、方法名自定义
     * 4、方法没有参数，可以有JoinPoint
     *
     * 特点：
     * 1、总是会执行
     * 2、在目标方法后执行
     */

    @After(value = "execution(* *..SomeServiceImpl.doThird(..))")
    public void myAfter(){
        System.out.println("执行最终通知");
    }

}

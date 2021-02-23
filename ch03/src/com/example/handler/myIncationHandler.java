package com.example.handler;

import com.example.utils.ServiceTools;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class myIncationHandler implements InvocationHandler {

    private Object target;

    public myIncationHandler(Object target) {
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        //通过代理对象执行方法时，会执行invoke
        Object res = null;
        ServiceTools.doLog();
        //执行目标类方法，通过method类实现，可以通过method.getName()获取当前执行的方法名称
        method.invoke(target, args);
        ServiceTools.doTrans();
        //目标方法执行结果
        return null;
    }
}

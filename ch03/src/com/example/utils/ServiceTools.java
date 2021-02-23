package com.example.utils;

import javax.xml.crypto.Data;
import java.util.Date;

public class ServiceTools {

    public static void doLog(){
        System.out.println("方法执行时间：" + new Date());
    }

    public static void doTrans(){
        System.out.println("非业务方法，方法执行后提交事务");
    }

}

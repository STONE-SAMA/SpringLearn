package com.example.service.impl;

import com.example.service.myService;

public class myServiceImpl implements myService {
    @Override
    public void doSome() {
        System.out.println("执行doSome");
    }

    @Override
    public void doAnother() {
        System.out.println("执行doAnother");
    }
}

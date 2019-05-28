package com.t.c;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class SuitConfig {
    @BeforeSuite
    public void beforSuite(){
        System.out.println("befor suite 运行啦");
    }
    @AfterSuite
    public void afterSuite(){
        System.out.println("after suite 运行啦");
    }
    @BeforeTest
    public void beforeTest(){
        System.out.println("beforeTest");
    }
    @AfterTest
    public void afterTest(){
        System.out.println("afterTest");
    }
}

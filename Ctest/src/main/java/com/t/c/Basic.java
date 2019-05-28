package com.t.c;


import org.testng.annotations.*;

public class Basic {
    @BeforeSuite
    public void beforSuite(){
        System.out.println("BeforeSuite");
    }
    @Test
    public void testCase1(){
        System.out.println("测试之中");
    }

    @Test
    public void testCase2(){
        System.out.println("测试之中2");
    }
    @BeforeMethod
    public void beforMethod(){
        System.out.println("测试之前");
    }
    @AfterMethod
    public void afterMethod(){
        System.out.println("测试之后");
    }

    @AfterSuite
    public void afterSuite(){
        System.out.println("AfterSuite");
    }
}

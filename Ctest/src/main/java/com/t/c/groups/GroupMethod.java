package com.t.c.groups;

import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;

public class GroupMethod {
    @Test(groups = "server")
    public void test1(){
        System.out.println("这是服务端测试方法1");
    }
    @Test(groups = "server")
    public void test2(){
        System.out.println("这是服务端测试方法2");
    }
    @Test(groups = "client")
    public void test3(){
        System.out.println("这是客户端测试方法3");
    }
    @Test(groups = "client")
    public void test4(){
        System.out.println("这是客户端测试方法4");
    }
    @BeforeGroups("server")
    public void beforeOnGroupsOnServer(){
        System.out.println("这是服务端运行前运行的方法");
    }
    @AfterGroups("server")
    public void afterGroupsOnServer(){
       System.out.println("这是服务端组运行之后运行的 方法");
    }
    @BeforeGroups("client")
    public void beforeOnGroupsOnClient(){
        System.out.println("这是客户端运行前运行的方法");
    }
    @AfterGroups("client")
    public void afterGroupsOnClient(){
        System.out.println("这是客户端组运行之后运行的 方法");
    }
}

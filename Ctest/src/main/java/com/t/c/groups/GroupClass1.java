package com.t.c.groups;

import org.testng.annotations.Test;

@Test(groups = "stu")
public class GroupClass1 {

    public void stu1(){
        System.out.println("GroupClass1中的stu1运行");
    }
    public void stu2(){
        System.out.println("GroupClass1中的stu2运行");
    }
}

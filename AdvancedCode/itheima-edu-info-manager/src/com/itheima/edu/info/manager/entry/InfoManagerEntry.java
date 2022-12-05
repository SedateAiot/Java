package com.itheima.edu.info.manager.entry;

import com.itheima.edu.info.manager.controller.StudentContorller;

import java.util.Scanner;

public class InfoManagerEntry {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 主菜单搭建
        while (true){
            System.out.println("------欢迎来到黑马信息管理系统-----");
            System.out.println("请输入您的选择： 1.学生管理   2.老师管理  3.退出 ");
            String choice = sc.next();
            switch (choice){
                case "1":
                    // System.out.println("学生管理");
                    // 开启学生管理系统的代码逻辑
                    StudentContorller studentContorller = new StudentContorller();
                    studentContorller.start();
                    break;
                case "2":
                    System.out.println("xxxx2");
                    break;
                case "3":
                    System.out.println("xxxx3");
                    System.exit(0); // 退出当前正在运行的JVM虚拟机！
                default:
                    System.out.println("您的输入有误，请重新输入！");
            }
        }
    }
}

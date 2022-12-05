package com.itheima.edu.info.manager.controller;

import com.itheima.edu.info.manager.domain.Student;
import com.itheima.edu.info.manager.service.StudentService;

import java.util.Scanner;

public class StudentContorller {
    public void start() {
        Scanner Scanner = new Scanner(System.in);
        // 开启学生管理系统，并展示学生管理系统菜单
        lo:while (true){
        System.out.println("-----欢迎来到<学生>管理系统----------");
        System.out.println("请输入您的选择： 1.添加学生   2.删除学生  3.修改学生 4.查看学生 5.退出 ");
        String choice = Scanner.next();
            switch (choice){
                case "1":
                    // System.out.println("添加学生");
                    addStudent();
                    break;
                case "2":
                    System.out.println("删除学生");
                    break;
                case "3":
                    System.out.println("修改学生");
                    break;
                case "4":
                    System.out.println("查看学生");
                    break;
                case "5":
                    System.out.println("感谢你使用学生管理系统！");
                    break lo;
                default:
                    System.out.println("您的输入有误，请重新输入！");
        }

        }
    }

    public void addStudent() {
        // 1.键盘接受学生信息
        StudentService studentService = new StudentService();
        Scanner Scanner = new Scanner(System.in);
        String id;
        while (true){
            System.out.println("请输入学生ID： ");
            id = Scanner.next();
            boolean flag = studentService.isExists(id);
            if(flag){
                System.out.println("学号已存在！");
            }else {
                break;
            }
        }

        System.out.println("请输入学生姓名： ");
        String name = Scanner.next();
        System.out.println("请输入学生年龄： ");
        String age = Scanner.next();
        System.out.println("请输入学生生日： ");
        String birthday = Scanner.next();

        // 2.将学生信息封装为学生对象
        Student stu = new Student();
        stu.setId(id);
        stu.setName(name);
        stu.setAge(age);
        stu.setBirthday(birthday);

        // 3.将学生对象床底给业务员（StudentService）中的addstudent方法


        // 4. 根据返回的布尔类型结果，在控制台打印成功或失败
        boolean result = studentService.addStudent(stu);
        if(result){
            System.out.println("添加成功！");
        }else {
            System.out.println("添加失败！");
        }



    }
}

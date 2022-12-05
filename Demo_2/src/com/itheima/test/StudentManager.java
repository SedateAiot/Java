package com.itheima.test;

import com.itheima.domain.Student;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentManager {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //
        ArrayList<Student> list = new ArrayList<>();
        lo:while (true){
            System.out.println(" ----Welcome to use student manager");
            System.out.println("1 add student");
            System.out.println("2 delete student");
            System.out.println("3 reset student");
            System.out.println("4 cheak out student");
            System.out.println("5 quit!");
            System.out.println("please input your choice:");

            String choice = sc.next();

            switch (choice){
                case "1":
                    //System.out.println("add student");
                    addStudent(list);
                    break ;
                case "2":
//                    System.out.println("delete student");
                    deleteStudent(list);
                    break;
                case "3":
//                    System.out.println("reset student");
                    updateStudent(list);
                    break;
                case "4":
//                    System.out.println("cheak out student");
                    queryStudents(list);
                    break;
                case "5":
                    System.out.println("quit!");
                    break lo;
                default:
                    System.out.println("input error! Please input again!");
                    break;
            }
        }

    }

    public static void updateStudent(ArrayList<Student> list) {
        System.out.println("please input want to reset which student id");
        Scanner sc = new Scanner(System.in);

        String updateSid = sc.next();
        int index = getIndex(list, updateSid);

        if(index == -1){
            System.out.println("None message!please input again;");

        }else {
            System.out.println("please input new student name:");
            String name = sc.next();
            System.out.println("please input new student age:");
            int age = sc.nextInt();
            System.out.println("please input new student birthday:");
            String birthday = sc.next();

            Student student = new Student(updateSid, name, age, birthday);

            list.set(index, student);
            System.out.println("update ok!!!");
        }
    }

    public static void deleteStudent(ArrayList<Student> list) {
        System.out.println("please input want to delete which student id");
        Scanner sc = new Scanner(System.in);

        String deleteSid = sc.next();
        int index = getIndex(list, deleteSid);

        if(index == -1){
            System.out.println("None message!please input again;");

        }else {
            list.remove(index);
            System.out.println("delete ok!!");
        }
    }

    public static void queryStudents(ArrayList<Student> list) {
        if(list.size()==0) {
            System.out.println(" None Message! please add some message before your check");
            return;
        }
        System.out.println("id\tstudent\tage\tbirthday");
        for (int i = 0; i < list.size(); i++) {
            Student student = list.get(i);
            System.out.println(student.getSid() + "\t" + student.getName()+"\t" + student.getAge() +"\t"+ student.getBirthday()) ;
        }
        }


    // add student
    public static void addStudent(ArrayList<Student> list) {
        Scanner sc =new Scanner(System.in);
        String sid;
        while (true){
            System.out.println("Please input your id:");
            sid = sc.next();

            int index = getIndex(list, sid);
            if(index == -1){
                break;
            }
        }

        System.out.println("Please input your name:");
        String name = sc.next();
        System.out.println("Please input your age:");
        int age = sc.nextInt();
        System.out.println("Please input your birthday:");
        String birthday = sc.next();

        Student stu = new Student(sid, name, age, birthday);

        list.add(stu);

        System.out.println("add ok! ");

    }

    public static int getIndex(ArrayList<Student> list, String sid){
        int index = -1;
        for (int i = 0; i < list.size(); i++) {
            Student student = list.get(i);
            String id = student.getSid();
            if (id.equals(sid)) {
                index = i;
            }
        }
        return index;



        }
    }


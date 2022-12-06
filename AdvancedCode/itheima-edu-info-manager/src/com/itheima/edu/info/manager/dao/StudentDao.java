package com.itheima.edu.info.manager.dao;

import com.itheima.edu.info.manager.domain.Student;
import com.itheima.edu.info.manager.service.StudentService;
import com.sun.source.tree.ReturnTree;

public class StudentDao {
    // 1. 创建学生对象数组
    private static Student[] students = new Student[5];
    public boolean addStudent(Student stu) {

        // 2. 定义变量index为-1 假设数组已经全部存满，没有null元素
        int index = -1;
        // 3. 遍历数组取出每一个元素，判断是否为null
        for (int i = 0; i < students.length; i++) {
            Student student =students[i];
            if(student == null){
                // 将内容为null的索引位置赋值给index，然后就退出循环
                index = i;
                break;
            }
        }
        if(index==-1){ // 假设 index还是等于-1，说明列表中没有null元素，说明列表满了
            return false;
        } else {  // 否则，就进行赋值
            // 4. 添加学生到数组
          students[index] = stu;
            // 5. 返回是否添加成功的布尔值
          return true;
        }


    }

    public Student[] findAllStudent() {
        return students;
    }

    public void deleteStudentById(String delId) {
        // 删除逻辑
        int Index = getIndexId(delId);

        students[Index] = null;
    }
    public int getIndexId(String id){
        int Index = -1;
        for (int i = 0; i < students.length; i++) {
            Student student = students[i];
            if(student!=null && student.getId().equals(id)){
                Index = i;
                break;
            }
        }
        return Index;
    }
}

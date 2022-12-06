package com.itheima.edu.info.manager.service;

import com.itheima.edu.info.manager.dao.StudentDao;
import com.itheima.edu.info.manager.domain.Student;

import java.lang.reflect.Array;
import java.time.OffsetDateTime;

public class StudentService {
    private StudentDao studentDao = new StudentDao();

    public void deleteStudentById(String delId) {
        studentDao.deleteStudentById(delId);
    }

    public boolean isExists(String id) {
        // 1.调用Dao中的findAllStudent方法，来将数组中所有的内容进行返回

        Student[] students = studentDao.findAllStudent();
        // 2.从返回的数组在寻找有没有id相同的
        boolean exists = false;
        for (int i = 0; i < students.length; i++) {
            Student student = students[i];
            if (student != null && student.getId().equals(id)) {
                exists = true;
                break;
            }
        }
        // 3.返回结果
        return exists;
    }

    public boolean addStudent(Student stu) {
        // 2. 将学生对象传递给Dao对象的addStudent方法  3. 将返回的布尔值 返回给StudentController
        return studentDao.addStudent(stu);
    }

    public Student[] findAllStudent() {
        Student[] allStudent = studentDao.findAllStudent();
        boolean flag = false;
        for (int i = 0; i < allStudent.length; i++) {
            Student student = allStudent[i];
            if (student != null){
                flag = true;
                break;
            }
        }
        if (flag){
            return allStudent;
        }else {
            return null;
        }
    }
}
package com.kuang.dao;

import com.kuang.pojo.Teacher;

import java.util.List;

public interface TeacherMapper {
    //获取所有老师
    List<Teacher> getTeacher();

    //获取指定老师下的所有学生
    Teacher getTeacher(int t);
}

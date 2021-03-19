package com.kuang.dao;

import com.kuang.pojo.Student;
import com.kuang.pojo.Teacher;
import com.kuang.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;


public class UserDaoTest {


    @Test
    public void getTeacherTest(){

        //第一步：获得sqlSession对象
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        try {
            //第二步：执行SQL
            TeacherMapper userDao = sqlSession.getMapper(TeacherMapper.class);
            List<Teacher> teacherList = userDao.getTeacher();
            for (Teacher teacher : teacherList) {
                System.out.println(teacher);
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            sqlSession.close();
        }
    }
}

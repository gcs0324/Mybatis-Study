package com.kuang.dao;

import com.kuang.pojo.User;
import com.kuang.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class UserDaoTest {

    @Test
    public void getUserListTest(){

        //第一步：获得sqlSession对象

        try (SqlSession sqlSession = MybatisUtils.getSqlSession()) {
            //第二步：执行SQL
            UserMapper userDao = sqlSession.getMapper(UserMapper.class);
            List<User> userList = userDao.getUserList();
            for (User user : userList) {
                System.out.println(user);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        //第三步：关闭sqlSession
    }

    @Test
    public void getUserByIdTest(){

        //第一步：获得sqlSession对象

        try (SqlSession sqlSession = MybatisUtils.getSqlSession()) {
            //第二步：执行SQL
            UserMapper userDao = sqlSession.getMapper(UserMapper.class);
            User user = userDao.getUserById(1);
            System.out.println(user);
        } catch (Exception e) {
            e.printStackTrace();
        }
        //第三步：关闭sqlSession
    }
}

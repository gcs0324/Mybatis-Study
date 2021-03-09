package com.kuang.dao;

import com.kuang.pojo.User;
import com.kuang.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.Logger;
import org.junit.Test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class UserDaoTest {

    static Logger logger = Logger.getLogger(UserDaoTest.class);

    @Test
    public void getUserListTest(){

        //第一步：获得sqlSession对象
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        try {
            //第二步：执行SQL
            UserMapper userDao = sqlSession.getMapper(UserMapper.class);
            List<User> userList = userDao.getUserList();
            for (User user : userList) {
                System.out.println(user);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            sqlSession.close();
        }
    }

    @Test
    public void Log4jTest() {
            logger.debug("debug");
            logger.info("info");
            logger.error("error");
    }

    @Test
    public void selectByLimitTest() {
        //第一步：获得sqlSession对象
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        try {
            //第二步：执行SQL
            UserMapper userDao = sqlSession.getMapper(UserMapper.class);
            HashMap<String,Integer> map = new HashMap<String, Integer>();
            map.put("startIndex",0);
            map.put("pageSize",1);
            List<User> userByLimit = userDao.getUserByLimit(map);
            for (User user : userByLimit) {
                System.out.println(user);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            sqlSession.close();
        }
    }
}

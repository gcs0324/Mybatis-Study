package com.kuang.dao;

import com.kuang.pojo.User;

import java.util.List;
import java.util.Map;

public interface UserMapper {
    //查询全部用户
    List<User> getUserList();

    //使用Limit分页查询
    List<User> getUserByLimit(Map<String,Integer> map);
    //java层面的分页查询【不常用】
}

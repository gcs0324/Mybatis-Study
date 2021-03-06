package com.kuang.dao;

import com.kuang.pojo.Blog;

import java.util.List;
import java.util.Map;

public interface BlogMapper {
    //查询全部Bolg
    List<Blog> getBolgList();
    //插入数据
    int addBlog(Blog blog);
    //查询博客
    List<Blog> queryBlogIF(Map map);
}

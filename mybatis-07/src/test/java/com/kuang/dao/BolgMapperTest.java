package com.kuang.dao;

import com.kuang.pojo.Blog;
import com.kuang.utils.IdUtils;
import com.kuang.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.Date;
import java.util.HashMap;
import java.util.List;

/**
 * @author: cs0324
 * @Date:   2021/3/19
 */
public class BolgMapperTest {

    @Test
    public void getBolgTest() {
        //第一步：获得sqlSession对象
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        //第二步：执行SQL
        BlogMapper mapper = sqlSession.getMapper(BlogMapper.class);
        List<Blog> bolgList = mapper.getBolgList();
        for (Blog bolg : bolgList) {
            System.out.println(bolg);
        }
        sqlSession.close();
    }

    @Test
    public void addBolgTest() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        BlogMapper mapper = sqlSession.getMapper(BlogMapper.class);
        Blog blog = new Blog();
        blog.setId(IdUtils.getId());
        blog.setTitle("Mybatis");
        blog.setAuthor("狂神说");
        blog.setCreateTime(new Date());
        blog.setViews(9999);

        mapper.addBlog(blog);

        blog.setId(IdUtils.getId());
        blog.setTitle("Java");
        mapper.addBlog(blog);

        blog.setId(IdUtils.getId());
        blog.setTitle("Spring");
        mapper.addBlog(blog);

        blog.setId(IdUtils.getId());
        blog.setTitle("微服务");
        mapper.addBlog(blog);

        sqlSession.commit();
        sqlSession.close();
    }

    @Test
    public void queryBolgIfTest() {
        //第一步：获得sqlSession对象
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        //第二步：执行SQL
        BlogMapper mapper = sqlSession.getMapper(BlogMapper.class);
        HashMap map = new HashMap();
        map.put("title","Java");
        List<Blog> blogs = mapper.queryBlogIF(map);

        for (Blog blog : blogs) {
            System.out.println(blog);
        }
    }
}

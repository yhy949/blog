package com.blitz.blog.web.service.impl;

import com.blitz.blog.web.dao.blog.BlogUserDao;
import com.blitz.blog.web.model.blog.BlogUser;
import com.blitz.blog.web.service.BlogUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * Created by yhy on 2016/12/12.
 */
@Service
public class BlogUserServiceImpl implements BlogUserService{
    @Autowired
    private BlogUserDao blogUserDao;


    @Override
    public int insert(BlogUser entity) {
        return 0;
    }

    @Override
    public int update(BlogUser entity) {
        return 0;
    }

    @Override
    public int updateParam(Map param) {
        return 0;
    }

    @Override
    public int delete(String primaryKey) {
        return 0;
    }

    @Override
    public int deleteParam(Map param) {
        return 0;
    }

    @Override
    public int truncate() {
        return 0;
    }

    @Override
    public int count() {
        return 0;
    }

    @Override
    public int count(Object param) {
        return 0;
    }

    @Override
    public BlogUser get(String primaryKey) {
        return blogUserDao.get(primaryKey);
    }

    @Override
    public List<BlogUser> select() {
        return null;
    }

    @Override
    public List<BlogUser> selectParam(Map param) {
        return null;
    }

    @Override
    public int insertBatch(List<BlogUser> list) {
        return 0;
    }

    @Override
    public int updateBatch(List<BlogUser> list) {
        return 0;
    }

    @Override
    public int deleteBatch(List<String> list) {
        return 0;
    }
}

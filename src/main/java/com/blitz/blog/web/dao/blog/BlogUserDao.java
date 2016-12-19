package com.blitz.blog.web.dao.blog;

import com.blitz.blog.web.base.BaseDao;
import com.blitz.blog.web.model.blog.BlogUser;
import org.apache.ibatis.session.RowBounds;

import java.util.List;
import java.util.Map;

public interface BlogUserDao extends BaseDao<BlogUser,String> {
    int insert(BlogUser record);

    int insertSelective(BlogUser record);

    List<BlogUser> findAll();

    int getCount(Map<String, Object> map);

    List<BlogUser> getPageAll(RowBounds rowBounds, Map<String, Object> map);

    @Override
    BlogUser get(String primaryKey);
}
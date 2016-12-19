package com.blitz.blog.web.dao.blog;

import com.blitz.blog.web.model.blog.BlogUserLog;
import org.apache.ibatis.session.RowBounds;

import java.util.List;
import java.util.Map;

public interface BlogUserLogDao {
    int insert(BlogUserLog record);

    int insertSelective(BlogUserLog record);

    int deleteByPrimaryKey(String userid);

    BlogUserLog selectByPrimaryKey(String userid);

    int updateByPrimaryKeySelective(BlogUserLog record);

    List<BlogUserLog> findAll();

    int getCount(Map<String, Object> map);

    List<BlogUserLog> getPageAll(RowBounds rowBounds, Map<String, Object> map);

    int updateByKeyWithBLOBs(BlogUserLog record);

    int updateByPrimaryKey(BlogUserLog record);
}
package com.blitz.blog.web.dao.blog;

import com.blitz.blog.web.model.blog.BlogSignture;
import org.apache.ibatis.session.RowBounds;

import java.util.List;
import java.util.Map;

public interface BlogSigntureDao {
    int insert(BlogSignture record);

    int insertSelective(BlogSignture record);

    int deleteByPrimaryKey(String userid);

    BlogSignture selectByPrimaryKey(String userid);

    int updateByPrimaryKeySelective(BlogSignture record);

    List<BlogSignture> findAll();

    int getCount(Map<String, Object> map);

    List<BlogSignture> getPageAll(RowBounds rowBounds, Map<String, Object> map);

    int updateByPrimaryKey(BlogSignture record);
}
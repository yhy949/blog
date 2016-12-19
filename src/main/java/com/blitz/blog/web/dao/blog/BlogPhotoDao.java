package com.blitz.blog.web.dao.blog;

import com.blitz.blog.web.model.blog.BlogPhoto;
import org.apache.ibatis.session.RowBounds;

import java.util.List;
import java.util.Map;

public interface BlogPhotoDao {
    int insert(BlogPhoto record);

    int insertSelective(BlogPhoto record);

    int deleteByPrimaryKey(String albumid);

    BlogPhoto selectByPrimaryKey(String albumid);

    int updateByPrimaryKeySelective(BlogPhoto record);

    List<BlogPhoto> findAll();

    int getCount(Map<String, Object> map);

    List<BlogPhoto> getPageAll(RowBounds rowBounds, Map<String, Object> map);

    int updateByPrimaryKey(BlogPhoto record);
}
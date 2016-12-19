package com.blitz.blog.web.dao.blog;

import com.blitz.blog.web.model.blog.BlogUserLogComment;
import com.blitz.blog.web.model.blog.BlogUserLogCommentKey;
import org.apache.ibatis.session.RowBounds;

import java.util.List;
import java.util.Map;

public interface BlogUserLogCommentDao {
    int insert(BlogUserLogComment record);

    int insertSelective(BlogUserLogComment record);

    int deleteByPrimaryKey(BlogUserLogCommentKey key);

    BlogUserLogComment selectByPrimaryKey(BlogUserLogCommentKey key);

    int updateByPrimaryKeySelective(BlogUserLogComment record);

    List<BlogUserLogComment> findAll();

    int getCount(Map<String, Object> map);

    List<BlogUserLogComment> getPageAll(RowBounds rowBounds, Map<String, Object> map);

    int updateByPrimaryKey(BlogUserLogComment record);
}
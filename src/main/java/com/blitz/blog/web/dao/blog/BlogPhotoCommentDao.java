package com.blitz.blog.web.dao.blog;

import com.blitz.blog.web.model.blog.BlogPhotoComment;
import com.blitz.blog.web.model.blog.BlogPhotoCommentKey;
import org.apache.ibatis.session.RowBounds;

import java.util.List;
import java.util.Map;

public interface BlogPhotoCommentDao {
    int insert(BlogPhotoComment record);

    int insertSelective(BlogPhotoComment record);

    int deleteByPrimaryKey(BlogPhotoCommentKey key);

    BlogPhotoComment selectByPrimaryKey(BlogPhotoCommentKey key);

    int updateByPrimaryKeySelective(BlogPhotoComment record);

    List<BlogPhotoComment> findAll();

    int getCount(Map<String, Object> map);

    List<BlogPhotoComment> getPageAll(RowBounds rowBounds, Map<String, Object> map);

    int updateByPrimaryKey(BlogPhotoComment record);
}
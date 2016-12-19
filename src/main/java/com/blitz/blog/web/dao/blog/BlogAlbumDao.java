package com.blitz.blog.web.dao.blog;

import com.blitz.blog.web.model.blog.BlogAlbum;
import com.blitz.blog.web.model.blog.BlogAlbumKey;
import org.apache.ibatis.session.RowBounds;

import java.util.List;
import java.util.Map;

public interface BlogAlbumDao {
    int insert(BlogAlbum record);

    int insertSelective(BlogAlbum record);

    int deleteByPrimaryKey(BlogAlbumKey key);

    BlogAlbum selectByPrimaryKey(BlogAlbumKey key);

    int updateByPrimaryKeySelective(BlogAlbum record);

    List<BlogAlbum> findAll();

    int getCount(Map<String, Object> map);

    List<BlogAlbum> getPageAll(RowBounds rowBounds, Map<String, Object> map);

    int updateByPrimaryKey(BlogAlbum record);
}
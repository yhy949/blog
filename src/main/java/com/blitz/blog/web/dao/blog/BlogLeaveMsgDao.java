package com.blitz.blog.web.dao.blog;

import com.blitz.blog.web.model.blog.BlogLeaveMsg;
import com.blitz.blog.web.model.blog.BlogLeaveMsgKey;
import org.apache.ibatis.session.RowBounds;

import java.util.List;
import java.util.Map;

public interface BlogLeaveMsgDao {
    int insert(BlogLeaveMsg record);

    int insertSelective(BlogLeaveMsg record);

    int deleteByPrimaryKey(BlogLeaveMsgKey key);

    BlogLeaveMsg selectByPrimaryKey(BlogLeaveMsgKey key);

    int updateByPrimaryKeySelective(BlogLeaveMsg record);

    List<BlogLeaveMsg> findAll();

    int getCount(Map<String, Object> map);

    List<BlogLeaveMsg> getPageAll(RowBounds rowBounds, Map<String, Object> map);

    int updateByPrimaryKey(BlogLeaveMsg record);
}
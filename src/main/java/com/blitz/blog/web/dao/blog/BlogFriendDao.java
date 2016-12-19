package com.blitz.blog.web.dao.blog;

import com.blitz.blog.web.model.blog.BlogFriend;
import com.blitz.blog.web.model.blog.BlogFriendKey;
import org.apache.ibatis.session.RowBounds;

import java.util.List;
import java.util.Map;

public interface BlogFriendDao {
    int insert(BlogFriend record);

    int insertSelective(BlogFriend record);

    int deleteByPrimaryKey(BlogFriendKey key);

    BlogFriend selectByPrimaryKey(BlogFriendKey key);

    int updateByPrimaryKeySelective(BlogFriend record);

    List<BlogFriend> findAll();

    int getCount(Map<String, Object> map);

    List<BlogFriend> getPageAll(RowBounds rowBounds, Map<String, Object> map);

    int updateByPrimaryKey(BlogFriend record);
}
package com.blitz.blog.web.dao.user.impl;


import com.blitz.blog.web.base.impl.BaseDaoImpl;
import com.blitz.blog.web.dao.user.UserDao;
import com.blitz.blog.web.model.user.User;
import org.springframework.stereotype.Repository;

/**
 * Created by yhy on 2016/6/29.
 */
@Repository
public class UserDaoImpl extends BaseDaoImpl<User,String> implements UserDao {

}

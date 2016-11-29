package com.blitz.blog.web.base.impl;

import com.blitz.blog.web.base.BaseDao;
import com.blitz.blog.web.base.BaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

/**
 * Created by yhy on 2016/6/29.
 */

/**
 * 所有自定义Service的顶级接口,封装常用的增删查改操作
 * T : 代表数据库中的表 映射的Java对象类型
 * PK :代表对象的主键类型
 * @author
 * @since 2016年6月29日 下午22:18:06
 */
@Service
public class BaseServiceImpl<T, PK extends Serializable> implements BaseService<T, PK > {

    @Autowired
    private BaseDao baseDao;

    @Override
    public int insert(T entity) {

        return baseDao.insert(entity);

    }

    @Override
    public int update(T entity) {

        return baseDao.update(entity);
    }

    @Override
    public int updateParam(Map param) {

        return baseDao.updateParam(param);
    }

    @Override
    public int delete(PK primaryKey) {

        return baseDao.delete(primaryKey);
    }

    @Override
    public int deleteParam(Map param) {

        return baseDao.updateParam(param);
    }

    @Override
    public int truncate() {
        return 0;
    }

    @Override
    public int count() {
        return 0;
    }

    @Override
    public int count(Object param) {
        return 0;
    }

    @Override
    public T get(PK primaryKey) {
       baseDao.get(primaryKey);
        return null;
    }

    @Override
    public List<T> select() {
        return null;
    }

    @Override
    public List<T> selectParam(Map param) {
        return null;
    }

    @Override
    public int insertBatch(List<T> list) {
        return 0;
    }

    @Override
    public int updateBatch(List<T> list) {
        return 0;
    }

    @Override
    public int deleteBatch(List<PK> list) {
        return 0;
    }
}

package com.blitz.blog.web.base.impl;

import com.blitz.blog.web.base.BaseDao;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.support.SqlSessionDaoSupport;

import javax.annotation.Resource;
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
public class BaseDaoImpl<T, PK extends Serializable> extends
        SqlSessionDaoSupport implements BaseDao<T, PK> {

    private String namespace;
    public static final String SQLID_INSERT = "insert";
    public static final String SQLID_INSERT_BATCH = "insertBatch";
    public static final String SQLID_UPDATE = "update";
    public static final String SQLID_UPDATE_PARAM = "updateParam";
    public static final String SQLID_UPDATE_BATCH = "updateBatch";
    public static final String SQLID_DELETE = "delete";
    public static final String SQLID_DELETE_PARAM = "deleteParam";
    public static final String SQLID_DELETE_BATCH = "deleteBatch";
    public static final String SQLID_TRUNCATE = "truncate";
    public static final String SQLID_SELECT = "select";
    public static final String SQLID_SELECT_PK = "selectPk";
    public static final String SQLID_SELECT_PARAM = "selectParam";
    public static final String SQLID_SELECT_FK = "selectFk";
    public static final String SQLID_COUNT = "count";
    public static final String SQLID_COUNT_PARAM = "countParam";

    @Resource(name = "sqlSessionTemplate")
    public void setSuperSqlSessionTemplate(SqlSessionTemplate sqlSessionTemplate) {
        super.setSqlSessionTemplate(sqlSessionTemplate);
    }

    public String getNamespace() {
        return namespace;
    }

    public void setNamespace(String namespace) {
        this.namespace = namespace;
    }

    /**
     * 新增实体
     * @param entity
     * @return 影响记录条数
     */
    @Override
    public int insert(T entity) {
        int rows = 0;
        try {
            rows = getSqlSession().insert(namespace + "." + SQLID_INSERT,
                    entity);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return rows;
    }

    /**
     * 修改一个实体对象（UPDATE一条记录）
     * @param entity 实体对象
     * @return 修改的对象个数，正常情况=1
     */
    @Override
    public int update(T entity) {
        int rows = 0;
        try {
            rows = getSqlSession().update(namespace + "." + SQLID_UPDATE,entity);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return rows;
    }

    /**
     * 修改符合条件的记录
     * <p>此方法特别适合于一次性把多条记录的某些字段值设置为新值（定值）的情况，比如修改符合条件的记录的状态字段</p>
     * <p>此方法的另一个用途是把一条记录的个别字段的值修改为新值（定值），此时要把条件设置为该记录的主键</p>
     * @param param 用于产生SQL的参数值，包括WHERE条件、目标字段和新值等
     * @return 修改的记录个数，用于判断修改是否成功
     */
    @Override
    public int updateParam(Map param) {
        int rows = 0;
        try {
            rows = getSqlSession().update(namespace + "." + SQLID_UPDATE_PARAM,param);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return rows;
    }

    /**
     * 按主键删除记录
     * @param primaryKey 主键对象
     * @return 删除的对象个数，正常情况=1
     */
    @Override
    public int delete(PK primaryKey) {
        int rows = 0;
        try {
            rows = getSqlSession().delete(namespace + "." + SQLID_DELETE,primaryKey);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return rows;
    }

    /**
     * 删除符合条件的记录
     * <p><strong>此方法一定要慎用，如果条件设置不当，可能会删除有用的记录！</strong></p>
     * @param param 用于产生SQL的参数值，包括WHERE条件（其他参数内容不起作用）
     * @return
     */
    @Override
    public int deleteParam(Map param) {
        int rows = 0;
        try {
            rows = getSqlSession().delete(namespace + "." + SQLID_DELETE_PARAM,param);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return rows;
    }

    /**
     * 清空表，比delete具有更高的效率，而且是从数据库中物理删除（delete是逻辑删除，被删除的记录依然占有空间）
     * <p><strong>此方法一定要慎用！</strong></p>
     * @return
     */
    @Override
    public int truncate() {
        int rows = 0;
        try {
            rows = getSqlSession().delete(namespace + "." + SQLID_TRUNCATE);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return rows;
    }

    /**
     * 查询整表总记录数
     * @return 整表总记录数
     */
    @Override
    public int count() {
        int result = 0;
        try {
            result = getSqlSession().selectOne(namespace + "." + SQLID_COUNT);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }

    /**
     * 查询符合条件的记录数
     * @param param 查询条件参数，包括WHERE条件（其他参数内容不起作用）。此参数设置为null，则相当于count()
     * @return
     */
    @Override
    public int count(Object param) {
        int result = 0;
        try {
            result = getSqlSession().selectOne(namespace + "." + SQLID_COUNT_PARAM,param);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }

    /**
     * 按主键取记录
     * @param primaryKey 主键值
     * @return 记录实体对象，如果没有符合主键条件的记录，则返回null
     */
    @Override
    public T get(PK primaryKey) {
        try {
            return getSqlSession().selectOne(namespace + "." + SQLID_SELECT_PK,primaryKey);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    /**
     * 取全部记录
     * @return 全部记录实体对象的List
     */
    @Override
    public List<T> select() {
        try {
            return getSqlSession().selectList(namespace + "." + SQLID_SELECT);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }

    }

    /**
     * 按条件查询记录
     * @param param 查询条件参数，包括WHERE条件、分页条件、排序条件
     * @return 符合条件记录的实体对象的List
     */
    @Override
    public List<T> selectParam(Map param) {
        try {
            return getSqlSession().selectList(namespace + "." + SQLID_SELECT_PARAM,param);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    /**
     * 批量插入
     * @param list
     */
    @Override
    public int insertBatch(List<T> list) {
        try {
            return getSqlSession().insert(namespace + "." + SQLID_INSERT_BATCH,list);
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }

    /**
     * 批量修改
     * @param list
     */
    @Override
    public int updateBatch(List<T> list) {
        int rows = 0;
        try {
            for (T t : list) {
                rows = rows + getSqlSession().update(namespace + "." + SQLID_UPDATE, t);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return rows;

    }

    /**
     * 批量删除
     * @param list
     */
    @Override
    public int deleteBatch(List<PK> list) {
        try {
            return getSqlSession().delete(namespace + "." + SQLID_DELETE_BATCH,list);
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }

    }

    /**
     * 按条件查询记录，并处理成分页结果
     * @param param 查询条件参数，包括WHERE条件、分页条件、排序条件
     * @return PaginationResult对象，包括（符合条件的）总记录数、页实体对象List等
     */
   /* @Override
    public PagingResult<T> selectPagination(PageEntity pageEntity) {
        try {
            int page = pageEntity.getPage() == null || "".equals(pageEntity.getPage()) ? 1 : pageEntity.getPage(); //默认为第一页
            int size = pageEntity.getSize() == null || "".equals(pageEntity.getSize()) ? 15 : pageEntity.getSize();; //默认每页15个

            RowBounds rowBounds = new RowBounds((page-1)*size, size);

            Map param = pageEntity.getParams();
            if (param != null) {
                param.put("orderColumn", pageEntity.getOrderColumn());
                param.put("orderTurn", pageEntity.getOrderTurn());
            }else {
                param = new HashMap();
                param.put("orderColumn", pageEntity.getOrderColumn());
                param.put("orderTurn", pageEntity.getOrderTurn());
            }

            List<T> resultList = getSqlSession().selectList(namespace + "." + SQLID_SELECT_PARAM,param,rowBounds);
            int totalSize = count(pageEntity.getParams());

            PagingResult<T> pagingResult = new PagingResult<T>();
            pagingResult.setCurrentPage(page);
            pagingResult.setTotalSize(totalSize);
            pagingResult.setResultList(resultList);
            return pagingResult;

        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }*/

}

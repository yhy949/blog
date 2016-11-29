package com.blitz.blog.web.base;

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
public interface BaseDao<T,PK extends Serializable> {
    /**
     * 新增实体
     * @param entity
     * @return 影响记录条数
     */
    public int insert(T entity);

    /**
     * 修改一个实体对象（UPDATE一条记录）
     * @param entity 实体对象
     * @return 修改的对象个数，正常情况=1
     */
    public int update(T entity);

    /**
     * 修改符合条件的记录
     * <p>此方法特别适合于一次性把多条记录的某些字段值设置为新值（定值）的情况，比如修改符合条件的记录的状态字段</p>
     * <p>此方法的另一个用途是把一条记录的个别字段的值修改为新值（定值），此时要把条件设置为该记录的主键</p>
     * @param param 用于产生SQL的参数值，包括WHERE条件、目标字段和新值等
     * @return 修改的记录个数，用于判断修改是否成功
     */
    public int updateParam(Map param);

    /**
     * 按主键删除记录
     * @param primaryKey 主键对象
     * @return 删除的对象个数，正常情况=1
     */
    public  int delete(PK primaryKey);

    /**
     * 删除符合条件的记录
     * <p><strong>此方法一定要慎用，如果条件设置不当，可能会删除有用的记录！</strong></p>
     * @param param 用于产生SQL的参数值，包括WHERE条件（其他参数内容不起作用）
     * @return
     */
    public int deleteParam(Map param);

    /**
     * 清空表，比delete具有更高的效率，而且是从数据库中物理删除（delete是逻辑删除，被删除的记录依然占有空间）
     * <p><strong>此方法一定要慎用！</strong></p>
     * @return
     */
    public int truncate();

    /**
     * 查询整表总记录数
     * @return 整表总记录数
     */
    public abstract int count();

    /**
     * 查询符合条件的记录数
     * @param param 查询条件参数，包括WHERE条件（其他参数内容不起作用）。此参数设置为null，则相当于count()
     * @return
     */
    public int count(Object param);

    /**
     * 按主键取记录
     * @param primaryKey 主键值
     * @return 记录实体对象，如果没有符合主键条件的记录，则返回null
     */
    public T get(PK primaryKey);

    /**
     * 取全部记录
     * @return 全部记录实体对象的List
     */
    public List<T> select();

    /**
     * 按条件查询记录
     * @param param 查询条件参数，包括WHERE条件、分页条件、排序条件
     * @return 符合条件记录的实体对象的List
     */
    public List<T> selectParam(Map param);

    /**
     * 批量插入
     * @param list
     */
    public int insertBatch(List<T> list);

    /**
     * 批量修改
     * @param list
     */
    public int updateBatch(List<T> list);

    /**
     * 批量删除
     * @param list
     */
    public int deleteBatch(List<PK> list);

    /**
     * 按条件查询记录，并处理成分页结果
     * @param param 查询条件参数，包括WHERE条件、分页条件、排序条件
     * @return PaginationResult对象，包括（符合条件的）总记录数、页实体对象List等
     */
//    public abstract PagingResult<T> selectPagination(PageEntity param);
}

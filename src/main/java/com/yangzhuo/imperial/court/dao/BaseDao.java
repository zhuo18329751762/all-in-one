package com.yangzhuo.imperial.court.dao;


import com.yangzhuo.imperial.court.util.JDBCUtils;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;

import java.sql.Connection;
import java.sql.SQLException;

/**
 * 所有dao实现类的基类
 * @param <T> 实体类的类型
 */
public class BaseDao<T> {
    // DBUtils 工具包提供的数据库操作对象
    private QueryRunner runner = new QueryRunner();


    /**
     * 查询单个对象
     * @param sql
     * @param entityClass
     * @param parameters
     * @return
     */
    public T getSingleBean(String sql,Class<T> entityClass,Object ... parameters){
        try {
            // 获取数据库连接
            Connection connection = JDBCUtils.getConnection();

            return runner.query(connection, sql, new BeanHandler<>(entityClass), parameters);

        } catch (SQLException e) {
            e.printStackTrace();

            // 如果真的抛出异常，则将编译时异常封装为运行时异常抛出
            new RuntimeException(e);
        }
        return null;
    }
}

package com.yangzhuo.imperial.court.util;

import com.alibaba.druid.pool.DruidDataSourceFactory;

import javax.sql.DataSource;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Properties;

/**
 * 功能一：从数据库获取数据连接
 * 功能二：从数据库获取数据库连接后，绑定到本地线程(ThreadLocal)
 * 功能三：释放线程时和本地线程解除绑定
 */
public class JDBCUtils {
    //数据源成员变量，设置为静态资源，保证大对象的单例性，同时保证静态方法中可以访问
    private static DataSource dataSource;

    private static ThreadLocal<Connection> threadLocal = new ThreadLocal<>();
    //在静态代码块中初始化数据
    static {
        //从jdbc,properties 文件中读取连接数据库的信息
        //为了保证程序代码的可移植性，需要基于一个确定的基准来读取这个文件
        //确定的基准：类路径的根目录resources目录下的内容经过构建打包操作后会确定放在WEB-INF/classes目录下
        //WEB-INF/classes目录下存放编译好的.class字节码文件，所以这个目录就称之为类路径
        //类路径无论在本地运行还是在服务器端运行都是一个确定的基准
        // 1.创建一个用于存储外部属性文件信息的Properties对象
        Properties properties = new Properties();

        // 2.使用当前类的类加载器加载外部属性文件：jdbc.properties
        InputStream inputStream = JDBCUtils.class.getClassLoader().getResourceAsStream("jdbc.properties");

        try {

            // 3.将外部属性文件jdbc.properties中的数据加载到properties对象中
            properties.load(inputStream);

            // 4.创建数据源对象
            dataSource = DruidDataSourceFactory.createDataSource(properties);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static Connection getConnection(){
        Connection connection = null;

        try {
            // 1、尝试从当前线程检查是否存在已经绑定的 Connection 对象
            connection = threadLocal.get();

            // 2、检查 Connection 对象是否为 null
            if (connection == null) {

                // 3、如果为 null，则从数据源获取数据库连接
                connection = dataSource.getConnection();

                // 4、获取到数据库连接后绑定到当前线程
                threadLocal.set(connection);

            }
        } catch (SQLException e) {
            e.printStackTrace();

            // 为了调用工具方法方便，编译时异常不往外抛
            // 为了不掩盖问题，捕获到的编译时异常封装为运行时异常抛出
            throw new RuntimeException(e);
        }

        return connection;
    }
    /**
     * 释放数据库连接
     */
    public static void releaseConnection(Connection connection) {

        if (connection != null) {

            try {
                // 在数据库连接池中将当前连接对象标记为空闲
                connection.close();

                // 将当前数据库连接从当前线程上移除
                threadLocal.remove();

            } catch (SQLException e) {
                e.printStackTrace();
                throw new RuntimeException(e);
            }

        }

    }
}

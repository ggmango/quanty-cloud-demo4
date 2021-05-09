package com.quanty.cloud.service.demo.util;

import com.alibaba.druid.pool.DruidDataSourceFactory;
import org.apache.commons.dbutils.DbUtils;

import javax.sql.DataSource;
import java.io.InputStream;
import java.sql.*;
import java.util.Properties;

/**
 * @author Abin
 * @version 1.0
 * @date 2021/4/12 15:58
 */
public class JDBCUtils {

    /**
     * 使用Druid数据库连接池技术
     */
    private static DataSource source;
    static{
        try {
            Properties pros = new Properties();

//            InputStream is = ClassLoader.getSystemClassLoader().getResourceAsStream("jdbc.properties");
//            pros.load(is);

            pros.setProperty("driverClassName", "com.mysql.cj.jdbc.Driver");
            pros.setProperty("url", "jdbc:mysql://mysql.zeit.org.cn:1606/geo_standard?useUnicode=true&characterEncoding=utf-8&useSSL=false&serverTimezone=UTC");
            pros.setProperty("username", "root");
            pros.setProperty("password", "aBc123456_");

            source = DruidDataSourceFactory.createDataSource(pros);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static Connection getConnection() throws SQLException{

        Connection conn = source.getConnection();
        return conn;

    }

    /**
     *
     * @Description 使用dbutils.jar中提供的DbUtils工具类，实现资源的关闭
     * @param conn
     * @param ps
     * @param rs
     */
    public static void closeResource(Connection conn, Statement ps, ResultSet rs){

        DbUtils.closeQuietly(conn);
        DbUtils.closeQuietly(ps);
        DbUtils.closeQuietly(rs);

    }
}

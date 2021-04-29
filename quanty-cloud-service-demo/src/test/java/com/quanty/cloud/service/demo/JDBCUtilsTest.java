package com.quanty.cloud.service.demo;

import com.quanty.cloud.service.demo.util.JDBCUtils;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.MapListHandler;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;

/**
 * @author Abin
 * @version 1.0
 * @date 2021/4/12 16:14
 */
@Transactional
@RunWith(SpringRunner.class)
@SpringBootTest
public class JDBCUtilsTest {

    /*
     * MapListHander:是ResultSetHandler接口的实现类，对应表中的多条记录。
     * 将字段及相应字段的值作为map中的key和value。将这些map添加到List中
     */
    @Test
    public void testQuery4(){
        Connection conn = null;
        try {
            QueryRunner runner = new QueryRunner();
            conn = JDBCUtils.getConnection();
//            String sql = "select * from tb_tableinfo";

            String sql = "select * from information_schema.columns where table_schema= 'geo_standard' and table_name = 'dldmdmq01'";

            MapListHandler handler = new MapListHandler();
            List<Map<String, Object>> list = runner.query(conn, sql, handler);
            list.forEach(System.out::println);
        } catch (SQLException e) {
            e.printStackTrace();
        }finally{
            JDBCUtils.closeResource(conn, null,null);

        }

    }

}

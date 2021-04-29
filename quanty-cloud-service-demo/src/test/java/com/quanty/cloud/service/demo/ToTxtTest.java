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
 * @date 2021/4/15 18:27
 */
@Transactional
@RunWith(SpringRunner.class)
@SpringBootTest
public class ToTxtTest {

    Connection conn = null;
    QueryRunner runner = null;

    @Test
    public void test() {

        try {
            runner = new QueryRunner();
            conn = JDBCUtils.getConnection();

            //1.对geo_standard数据库进行操作
//            selectFieldsOfEachTable("geo_standard");

            //2.对datangpo数据库进行操作
            selectFieldsOfEachTable("datangpo");

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            JDBCUtils.closeResource(conn, null, null);
        }

    }

    //根据数据库名查找该数据库中所有的表名
    public List<Map<String, Object>> selectTableName(String dataBaseName) throws SQLException {
        String sql = "select table_name from information_schema.tables where table_schema= ?";
        MapListHandler handler = new MapListHandler();
        List<Map<String, Object>> list = runner.query(conn, sql, handler, dataBaseName);
        return list;
    }

    //根据数据库名及表名，查询该表的字段名
    public List<Map<String, Object>> selectColumnName(String dataBaseName,String tableName) throws SQLException {
        String sql = "select COLUMN_NAME from information_schema.columns where table_schema= ? and table_name = ?";
        MapListHandler handler = new MapListHandler();
        List<Map<String, Object>> list = runner.query(conn, sql, handler,dataBaseName,tableName);
        return list;
    }

    //遍历查询结果list列表，根据表名查出对应表的各个字段，并拼接成相应格式的字符串
    public String selectFieldsOfEachTable (String dataBaseName) throws SQLException {

        String str = null;
        String str1 = "";
        String str2 = "case $1 in\n";
        String str3 = "\"first\")\n";

        List<Map<String, Object>> tableNameList = selectTableName(dataBaseName);

        //遍历tableNameList，根据表名查询该表的字段名
        for (Map<String, Object> stringObjectMap : tableNameList) {
            String tableName = (String) stringObjectMap.get("TABLE_NAME");
            str1 = str1 + "import_" + tableName + "(){\nimport_data " + tableName + " \"select\n";
            str2 = str2 + "\"" + tableName + "\")\n" +
                    "import_" + tableName + "\n" +
                    ";;\n";
            str3 = str3 + "import_" + tableName + "\n";

            List<Map<String, Object>> columnNameList = selectColumnName(dataBaseName,tableName);
            Map<String, Object> map = null;
            for (int i = 0; i < columnNameList.size() - 1; i++) {
                map= columnNameList.get(i);
                String columnName = (String) map.get("COLUMN_NAME");
                str1 = str1 + "    " + columnName + ",\n";
            }

            map = columnNameList.get(columnNameList.size() - 1);
            String columnName = (String) map.get("COLUMN_NAME");
            str1 = str1 + "    " + columnName + "\n";
            str1 = str1 + "from " + tableName + "\nwhere 1=1\"\n}\n";

        }
        str3 = str3 + ";;\n" +
                "esac\n";

        str = str1 + str2 + str3;
        System.out.println(str);
        return str;
    }

    //将字符串放到txt文件中
    public void stringToTxt(String dataBaseName) {

    }

}

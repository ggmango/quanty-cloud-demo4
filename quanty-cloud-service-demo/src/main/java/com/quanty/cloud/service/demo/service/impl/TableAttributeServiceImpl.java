package com.quanty.cloud.service.demo.service.impl;

import com.quanty.cloud.common.resposeobject.BaseResult;
import com.quanty.cloud.service.demo.service.TableAttributeService;
import com.quanty.cloud.service.demo.util.JDBCUtils;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.MapListHandler;
import org.springframework.stereotype.Service;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;

/**
 * @author Abin
 * @version 1.0
 * @date 2021/4/12 21:20
 */
@Service
public class TableAttributeServiceImpl implements TableAttributeService {
    @Override
    public BaseResult selectTableAttributeByTableName(String dataBaseName,String tableName) {

        Connection conn = null;
        List<Map<String, Object>> list = null;

        try {

            QueryRunner runner = new QueryRunner();
            conn = JDBCUtils.getConnection();

//            String sql = "select * from information_schema.columns where table_schema= ? and table_name = ?";
            String sql = "select COLUMN_NAME,ORDINAL_POSITION,COLUMN_DEFAULT,IS_NULLABLE,COLUMN_TYPE,COLUMN_KEY,PRIVILEGES,COLUMN_COMMENT from information_schema.columns where table_schema= ? and table_name = ?";

            MapListHandler handler = new MapListHandler();
            list = runner.query(conn, sql, handler,dataBaseName,tableName);

//            list.forEach(System.out::println);
        } catch (SQLException e) {
            e.printStackTrace();
        }finally{
            JDBCUtils.closeResource(conn, null,null);
        }

        if (null == list) {
            return BaseResult.fail("查询失败");
        }

        return BaseResult.success("查询成功",list.size(),list);

    }
}

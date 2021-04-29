package com.quanty.cloud.service.demo.service.impl;

import com.quanty.cloud.common.resposeobject.BaseResult;
import com.quanty.cloud.service.demo.entity.TableSort;
import com.quanty.cloud.service.demo.service.TableSortService;
import com.quanty.cloud.service.demo.util.JDBCUtils;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.MapListHandler;
import org.springframework.stereotype.Service;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author Abin
 * @version 1.0
 * @date 2021/4/22 10:55
 */
@Service
public class TableSortServiceImpl implements TableSortService {

    @Override
    public BaseResult sortTable(TableSort tableSort) {
        Connection conn = null;
        List<Map<String, Object>> list = null;

        try {

            QueryRunner runner = new QueryRunner();
            conn = JDBCUtils.getConnection();
            String sql = "select " + tableSort.getColumnTableName() + ", " + tableSort.getColumnTableCode() + ", " + tableSort.getColumnSortName() + " from " + tableSort.getTableName();

            MapListHandler handler = new MapListHandler();
            list = runner.query(conn, sql, handler);

//            list.forEach(System.out::println);
        } catch (SQLException e) {
            e.printStackTrace();
        }finally{
            JDBCUtils.closeResource(conn, null,null);
        }

        //遍历list，将list中需要的字段封装到map中
        Map<Map<String,String>, String> map = new HashMap<>();
        for (Map<String, Object> stringObjectMap : list) {
            Map<String, String> codeAndNameMap = new HashMap<>();
            codeAndNameMap.put(stringObjectMap.get(tableSort.getColumnTableCode()).toString(), stringObjectMap.get(tableSort.getColumnTableName()).toString());
            String columnSortName = stringObjectMap.get(tableSort.getColumnSortName()).toString();
            map.put(codeAndNameMap, columnSortName);
        }

//        System.out.println(map);

        //遍历map，将map中的数据重新封装到hashMap中
        Map<String, Map<String,String>> hashMap = new HashMap<>();
        for (Map.Entry<Map<String,String>, String> entry : map.entrySet()) {
            String categoryName =  entry.getValue();
            Map<String, String> codeAndNameMap1 = null;
            codeAndNameMap1 = hashMap.get(categoryName);
            if (codeAndNameMap1 == null) {
                codeAndNameMap1 = new HashMap<>();
            }
            Map<String, String> key = entry.getKey();
            codeAndNameMap1.putAll(key);
            hashMap.put(categoryName, codeAndNameMap1);
        }

        if (null == list) {
            return BaseResult.fail("查询失败");
        }

        return BaseResult.success("查询成功",list.size(),hashMap);
    }

}

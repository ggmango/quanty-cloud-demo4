package com.quanty.cloud.service.demo.service.impl;

import com.quanty.cloud.common.resposeobject.BaseResult;
import com.quanty.cloud.service.demo.entity.PageBean;
import com.quanty.cloud.service.demo.service.TableService;
import com.quanty.cloud.service.demo.util.JDBCUtils;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.MapListHandler;
import org.apache.commons.dbutils.handlers.ScalarHandler;
import org.springframework.stereotype.Service;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;

/**
 * @author Abin
 * @version 1.0
 * @date 2021/4/12 16:36
 */
@Service
public class TableServiceImpl implements TableService {
    @Override
    public BaseResult selectTableByTableName(Integer currentPage,Integer pageSize, String tableName) {

        Connection conn = null;
        List<Map<String, Object>> list = null;
        PageBean pageBean = new PageBean();
        pageBean.setCurrentPage(currentPage);
        pageBean.setPageSize(pageSize);

        try {

            QueryRunner runner = new QueryRunner();
            conn = JDBCUtils.getConnection();

            Long count = (Long) runner.query(conn, "select count(*) from " + tableName, new ScalarHandler());//得到总记录数
            pageBean.setCount(count);
            int totalPage = (int) Math.ceil(count*1.0/pageSize);  //得到总页数
            pageBean.setTotalPage(totalPage);

            String sql = "select * from " + tableName + " limit ?,?";

            MapListHandler handler = new MapListHandler();
            list = runner.query(conn, sql, handler,pageSize*(currentPage-1),pageSize);

            pageBean.setList(list);

//            list.forEach(System.out::println);
        } catch (SQLException e) {
            e.printStackTrace();
        }finally{
            JDBCUtils.closeResource(conn, null,null);
        }

        if (null == list) {
            return BaseResult.fail("查询失败");
        }

        return BaseResult.success("查询成功",list.size(),pageBean);

    }
}

package com.quanty.cloud.service.demo.entity;

import java.util.List;
import java.util.Map;

/**
 * @author Abin
 * @version 1.0
 * @date 2021/4/22 13:34
 */
public class PageBean {

    private Integer currentPage;   //当前页面
    private Integer pageSize;      //每页显示的记录数
    private Long count;         //总记录数
    private Integer totalPage;     //总页数
    private List<Map<String, Object>> list;  //保存满足分页条件的记录数

    public Integer getCurrentPage() {
        return currentPage;
    }

    public void setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public Long getCount() {
        return count;
    }

    public void setCount(Long count) {
        this.count = count;
    }

    public Integer getTotalPage() {
        return totalPage;
    }

    public void setTotalPage(Integer totalPage) {
        this.totalPage = totalPage;
    }

    public List<Map<String, Object>> getList() {
        return list;
    }

    public void setList(List<Map<String, Object>> list) {
        this.list = list;
    }

    @Override
    public String toString() {
        return "PageBean{" +
                "currentPage=" + currentPage +
                ", pageSize=" + pageSize +
                ", count=" + count +
                ", totalPage=" + totalPage +
                ", list=" + list +
                '}';
    }
}

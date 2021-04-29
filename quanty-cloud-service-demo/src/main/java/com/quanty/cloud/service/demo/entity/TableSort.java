package com.quanty.cloud.service.demo.entity;

import org.springframework.stereotype.Component;

/**
 * @author Abin
 * @version 1.0
 * @date 2021/4/22 11:40
 */
public class TableSort {
    private String tableName;
    private String columnTableName;
    private String columnTableCode;
    private String columnSortName;

    public TableSort() {
    }

    public TableSort(String tableName, String columnTableName, String columnTableCode, String columnSortName) {
        this.tableName = tableName;
        this.columnTableName = columnTableName;
        this.columnTableCode = columnTableCode;
        this.columnSortName = columnSortName;
    }

    public String getTableName() {
        return tableName;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    public String getColumnTableName() {
        return columnTableName;
    }

    public void setColumnTableName(String columnTableName) {
        this.columnTableName = columnTableName;
    }

    public String getColumnTableCode() {
        return columnTableCode;
    }

    public void setColumnTableCode(String columnTableCode) {
        this.columnTableCode = columnTableCode;
    }

    public String getColumnSortName() {
        return columnSortName;
    }

    public void setColumnSortName(String columnSortName) {
        this.columnSortName = columnSortName;
    }

    @Override
    public String toString() {
        return "TableSort{" +
                "tableName='" + tableName + '\'' +
                ", columnTableName='" + columnTableName + '\'' +
                ", columnTableCode='" + columnTableCode + '\'' +
                ", columnSortName='" + columnSortName + '\'' +
                '}';
    }
}

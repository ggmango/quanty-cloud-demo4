package com.quanty.cloud.service.demo.entity;

import javax.persistence.*;

@Table(name = "tb_tableinfo")
public class TbTableinfo {
    @Id
    @Column(name = "TABLE_CODE")
    private String tableCode;

    @Column(name = "TABLE_NAME")
    private String tableName;

    @Column(name = "TOP_CATEGORY")
    private String topCategory;

    @Column(name = "CATEGORY_NAME")
    private String categoryName;

    @Column(name = "PRIMARY_KEY")
    private String primaryKey;

    @Column(name = "KEY_CNAME")
    private String keyCname;

    @Column(name = "TABLE_LEVEL")
    private Integer tableLevel;

    @Column(name = "PARENT_CODE")
    private String parentCode;

    /**
     * @return TABLE_CODE
     */
    public String getTableCode() {
        return tableCode;
    }

    /**
     * @param tableCode
     */
    public void setTableCode(String tableCode) {
        this.tableCode = tableCode;
    }

    /**
     * @return TABLE_NAME
     */
    public String getTableName() {
        return tableName;
    }

    /**
     * @param tableName
     */
    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    /**
     * @return TOP_CATEGORY
     */
    public String getTopCategory() {
        return topCategory;
    }

    /**
     * @param topCategory
     */
    public void setTopCategory(String topCategory) {
        this.topCategory = topCategory;
    }

    /**
     * @return CATEGORY_NAME
     */
    public String getCategoryName() {
        return categoryName;
    }

    /**
     * @param categoryName
     */
    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    /**
     * @return PRIMARY_KEY
     */
    public String getPrimaryKey() {
        return primaryKey;
    }

    /**
     * @param primaryKey
     */
    public void setPrimaryKey(String primaryKey) {
        this.primaryKey = primaryKey;
    }

    /**
     * @return KEY_CNAME
     */
    public String getKeyCname() {
        return keyCname;
    }

    /**
     * @param keyCname
     */
    public void setKeyCname(String keyCname) {
        this.keyCname = keyCname;
    }

    /**
     * @return TABLE_LEVEL
     */
    public Integer getTableLevel() {
        return tableLevel;
    }

    /**
     * @param tableLevel
     */
    public void setTableLevel(Integer tableLevel) {
        this.tableLevel = tableLevel;
    }

    /**
     * @return PARENT_CODE
     */
    public String getParentCode() {
        return parentCode;
    }

    /**
     * @param parentCode
     */
    public void setParentCode(String parentCode) {
        this.parentCode = parentCode;
    }
}
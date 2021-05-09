package com.quanty.cloud.service.demo.entity;


import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

/**
 * @author Abin
 * @version 1.0
 * @date 2021/4/22 11:40
 */
@ApiModel(value = "查询对象", description = "表分类查询对象封装")
@Data
public class TableSort implements Serializable {
    private static final long serialVersionUID = 1L;

    @ApiModelProperty(example = "geo_standard.tb_tableinfo")
    private String tableName;

    @ApiModelProperty(example = "TABLE_NAME")
    private String columnTableName;

    @ApiModelProperty(example = "TABLE_CODE")
    private String columnTableCode;

    @ApiModelProperty(example = "CATEGORY_NAME")
    private String columnSortName;

}

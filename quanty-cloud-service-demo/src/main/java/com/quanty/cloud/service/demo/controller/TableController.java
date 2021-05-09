package com.quanty.cloud.service.demo.controller;

import com.quanty.cloud.common.resposeobject.BaseResult;
import com.quanty.cloud.service.demo.service.TableService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author Abin
 * @version 1.0
 * @date 2021/4/12 16:41
 */
@Api(description = "表数据分页查询")
@RestController
@RequestMapping("table")
@CrossOrigin
public class TableController {

    @Autowired
    private TableService tableService;

    @GetMapping("selectTableByTableName/{tableName}/{currentPage}/{pageSize}")
    public BaseResult select(@PathVariable("tableName") @ApiParam(name = "tableName", value = "表名称<注意带上数据库名称：数据库名称.表名称>",example = "geo_standard.dldmdmq01") String tableName,
                             @PathVariable("currentPage") @ApiParam(name = "currentPage", value = "当前页",example = "1") Integer currentPage,
                             @PathVariable("pageSize") @ApiParam(name = "pageSize", value = "页大小",example = "3")Integer pageSize) {
        return tableService.selectTableByTableName(currentPage,pageSize,tableName);
    }

}

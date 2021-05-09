package com.quanty.cloud.service.demo.controller;

import com.quanty.cloud.common.resposeobject.BaseResult;
import com.quanty.cloud.service.demo.service.TableAttributeService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author Abin
 * @version 1.0
 * @date 2021/4/12 21:29
 */
@Api(description = "表属性信息查询")
@RestController
@RequestMapping("tableAttribute")
@CrossOrigin
public class TableAttributeController {

    @Autowired
    private TableAttributeService tableAttributeService;

    @GetMapping("selectTableAttributeByTableName/{dataBaseName}/{tableName}")
    public BaseResult select(@PathVariable("dataBaseName") @ApiParam(name = "dataBaseName", value = "数据库名称",example = "geo_standard") String dataBaseName,
                             @PathVariable("tableName") @ApiParam(name = "tableName", value = "表名称",example = "dldmdmq01") String tableName) {
        return tableAttributeService.selectTableAttributeByTableName(dataBaseName,tableName);
    }

}

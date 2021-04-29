package com.quanty.cloud.service.demo.controller;

import com.quanty.cloud.common.resposeobject.BaseResult;
import com.quanty.cloud.service.demo.service.TableService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author Abin
 * @version 1.0
 * @date 2021/4/12 16:41
 */
@RestController
@RequestMapping("table")
@CrossOrigin
public class TableController {

    @Autowired
    private TableService tableService;

    @GetMapping("selectTableByTableName/{tableName}/{currentPage}/{pageSize}")
    public BaseResult select(@PathVariable("tableName") String tableName,@PathVariable("currentPage") Integer currentPage,@PathVariable("pageSize") Integer pageSize) {
        return tableService.selectTableByTableName(currentPage,pageSize,tableName);
    }

}

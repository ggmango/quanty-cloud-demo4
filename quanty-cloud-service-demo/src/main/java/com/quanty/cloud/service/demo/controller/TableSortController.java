package com.quanty.cloud.service.demo.controller;

import com.quanty.cloud.common.resposeobject.BaseResult;
import com.quanty.cloud.service.demo.entity.TableSort;
import com.quanty.cloud.service.demo.service.TableSortService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

/**
 * @author Abin
 * @version 1.0
 * @date 2021/4/22 11:34
 */
@RestController
@RequestMapping("tableSort")
@CrossOrigin
public class TableSortController {

    @Autowired
    TableSortService tableSortService;

    @RequestMapping("/getSort")
    public BaseResult select(@RequestParam Map<String,String> params) {

        TableSort tableSort = new TableSort();
        tableSort.setTableName(params.get("tableName"));
        tableSort.setColumnTableName(params.get("columnTableName"));
        tableSort.setColumnTableCode(params.get("columnTableCode"));
        tableSort.setColumnSortName(params.get("columnSortName"));

        return tableSortService.sortTable(tableSort);
    }

}

package com.quanty.cloud.service.demo.controller;

import com.quanty.cloud.common.resposeobject.BaseResult;
import com.quanty.cloud.service.demo.entity.TableSort;
import com.quanty.cloud.service.demo.service.TableSortService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author Abin
 * @version 1.0
 * @date 2021/4/22 11:34
 */
@Api(description = "数据库表分类")
@RestController
@RequestMapping("tableSort")
@CrossOrigin
public class TableSortController {

    @Autowired
    TableSortService tableSortService;

    @PostMapping("/getSort")
    public BaseResult select(@RequestBody TableSort tableSort) {
        return tableSortService.sortTable(tableSort);
    }

}

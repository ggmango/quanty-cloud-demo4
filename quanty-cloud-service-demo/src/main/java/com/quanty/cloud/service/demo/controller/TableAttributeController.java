package com.quanty.cloud.service.demo.controller;

import com.quanty.cloud.common.resposeobject.BaseResult;
import com.quanty.cloud.service.demo.service.TableAttributeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author Abin
 * @version 1.0
 * @date 2021/4/12 21:29
 */
@RestController
@RequestMapping("tableAttribute")
@CrossOrigin
public class TableAttributeController {

    @Autowired
    private TableAttributeService tableAttributeService;

    @GetMapping("selectTableAttributeByTableName/{dataBaseName}/{tableName}")
    public BaseResult select(@PathVariable("dataBaseName") String dataBaseName,@PathVariable("tableName") String tableName) {
        return tableAttributeService.selectTableAttributeByTableName(dataBaseName,tableName);
    }

}

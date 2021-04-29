package com.quanty.cloud.service.demo.controller;

import com.quanty.cloud.common.resposeobject.BaseResult;
import com.quanty.cloud.service.demo.service.TbTableinfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author Abin
 * @version 1.0
 * @date 2021/4/12 9:36
 */
@RestController
@RequestMapping("TbTableinfo")
@CrossOrigin
public class TbTableinfoController {

    @Autowired
    private TbTableinfoService tbTableinfoService;

    /**
     * 对数据库表进行分类
     * @param
     * @return
     */
    @GetMapping("sortTable")
    public BaseResult sortTable(){
        return tbTableinfoService.sort();
    }

}

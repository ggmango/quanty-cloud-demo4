package com.quanty.cloud.service.demo.service.impl;

import com.quanty.cloud.common.resposeobject.BaseResult;
import com.quanty.cloud.service.demo.entity.TbTableinfo;
import com.quanty.cloud.service.demo.mapper.TbTableinfoMapper;
import com.quanty.cloud.service.demo.service.TbTableinfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

/**
 * @author Abin
 * @version 1.0
 * @date 2021/4/12 9:32
 */
@Service
public class TbTableinfoServiceImpl implements TbTableinfoService {

    @Autowired
    private TbTableinfoMapper tbTableinfoMapper;

    @Override
    public BaseResult sort() {

        //查找表中所有数据
        List<TbTableinfo> tableinfolist = tbTableinfoMapper.selectAll();

        //遍历list，将list中需要的字段封装到map中
        Map<Map<String,String>, String> map = new HashMap<>();
        for (TbTableinfo tableinfo : tableinfolist) {
            Map<String, String> codeAndNameMap = new HashMap<>();
            codeAndNameMap.put(tableinfo.getTableCode(), tableinfo.getTableName());
            String categoryName = tableinfo.getCategoryName();
            map.put(codeAndNameMap, categoryName);
        }

//        System.out.println(map);

        //遍历map，将map中的数据重新封装到hashMap中
        Map<String, Map<String,String>> hashMap = new HashMap<>();
        for (Map.Entry<Map<String,String>, String> entry : map.entrySet()) {
            String categoryName =  entry.getValue();
            Map<String, String> codeAndNameMap1 = null;
            codeAndNameMap1 = hashMap.get(categoryName);
            if (codeAndNameMap1 == null) {
                codeAndNameMap1 = new HashMap<>();
            }
            Map<String, String> key = entry.getKey();
            codeAndNameMap1.putAll(key);
            hashMap.put(categoryName, codeAndNameMap1);
        }

        if (null == tableinfolist) {
            return BaseResult.fail("查询失败");
        }

        return BaseResult.success("查询成功",tableinfolist.size(),hashMap);
    }
}

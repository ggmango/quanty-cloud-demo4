package com.quanty.cloud.service.demo.service;

import com.quanty.cloud.common.resposeobject.BaseResult;

/**
 * @author Abin
 * @version 1.0
 * @date 2021/4/12 21:18
 */
public interface TableAttributeService {

    BaseResult selectTableAttributeByTableName(String dataBaseName,String tableName);

}

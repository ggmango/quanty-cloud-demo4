package com.quanty.cloud.service.demo.service;

import com.quanty.cloud.common.resposeobject.BaseResult;

/**
 * @author Abin
 * @version 1.0
 * @date 2021/4/12 16:34
 */
public interface TableService {

    BaseResult selectTableByTableName(Integer currentPage,Integer pageSize, String tableName);

}

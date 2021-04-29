package com.quanty.cloud.service.demo.service;

import com.quanty.cloud.common.resposeobject.BaseResult;
import com.quanty.cloud.service.demo.entity.TableSort;

/**
 * @author Abin
 * @version 1.0
 * @date 2021/4/22 10:53
 */
public interface TableSortService {

    BaseResult sortTable(TableSort tableSort);

}

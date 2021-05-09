package com.quanty.cloud.service.demo;

import com.quanty.cloud.service.demo.service.TableSortService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author Abin
 * @version 1.0
 * @date 2021/4/22 11:20
 */
@Transactional
@RunWith(SpringRunner.class)
@SpringBootTest
public class TableSortTest {

    @Autowired
    TableSortService tableSortService;

    @Test
    public void test() {
//        TableSort tableSort = new TableSort("geo_standard.tb_tableinfo","TABLE_NAME","TABLE_CODE","CATEGORY_NAME");
//        System.out.println(tableSortService.sortTable(tableSort));
    }

}

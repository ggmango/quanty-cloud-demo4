package com.quanty.cloud.service.demo;

import com.quanty.cloud.service.demo.service.TableService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author Abin
 * @version 1.0
 * @date 2021/4/12 16:53
 */
@Transactional
@RunWith(SpringRunner.class)
@SpringBootTest
public class TableTest {

    @Autowired
    private TableService tableService;

    @Test
    public void test() {

        System.out.println(tableService.selectTableByTableName(1,5,"geo_standard.dldmdmq01"));
        System.out.println(tableService.selectTableByTableName(1,2,"quantyu.dmch0101"));
        System.out.println(tableService.selectTableByTableName(1,3,"datangpo.dmch0101"));

    }

}

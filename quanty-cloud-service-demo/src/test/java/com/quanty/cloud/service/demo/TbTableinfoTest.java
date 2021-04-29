package com.quanty.cloud.service.demo;

import com.quanty.cloud.service.demo.service.TbTableinfoService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author Abin
 * @version 1.0
 * @date 2021/4/12 10:59
 */
@Transactional
@RunWith(SpringRunner.class)
@SpringBootTest
public class TbTableinfoTest {

    @Autowired
    private TbTableinfoService tbTableinfoService;

    @Test
    public void test() {

        System.out.println(tbTableinfoService.sort());

    }
}

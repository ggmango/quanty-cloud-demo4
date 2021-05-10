package com.quanty.cloud.service.zk.service.impl;

import com.quanty.cloud.service.zk.entity.fault.Fault;
import com.quanty.cloud.service.zk.mapper.mapper2.FaultMapper;
import com.quanty.cloud.service.zk.service.FaultService;
import com.quanty.cloud.service.zk.service.FaultService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Classname FaultServiceImpl
 * @Description 断层信息服务
 * @Date 2020/12/23 16:24
 * @Created by willi
 */
@Service
public class FaultServiceImpl implements FaultService {

    @Autowired
    private FaultMapper faultMapper;

    /**
     * 返回所有断层信息
     * @return
     */
    @Override
    public List<Fault> findallFault() {
        return faultMapper.findallfault();
    }
}

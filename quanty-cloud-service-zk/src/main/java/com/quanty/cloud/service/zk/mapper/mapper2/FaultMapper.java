package com.quanty.cloud.service.zk.mapper.mapper2;

import com.quanty.cloud.service.zk.entity.fault.Fault;
import com.quanty.cloud.service.zk.tkmybatismapper.MyMapper;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface FaultMapper extends MyMapper<Fault> {

    List<Fault> findallfault();
}
package com.quanty.cloud.service.zk.mapper.mapper1;

import com.quanty.cloud.service.zk.entity.Zkvzk;
import com.quanty.cloud.service.zk.tkmybatismapper.MyMapper;
import org.springframework.stereotype.Repository;

@Repository
public interface ZkvzkMapper extends MyMapper<Zkvzk> {
    Boolean updateByZkid(Zkvzk zkvzk);
}
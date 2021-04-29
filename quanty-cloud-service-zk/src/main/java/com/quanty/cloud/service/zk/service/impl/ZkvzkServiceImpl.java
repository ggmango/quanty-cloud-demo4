package com.quanty.cloud.service.zk.service.impl;

import com.quanty.cloud.common.resposeobject.BaseResult;
import com.quanty.cloud.service.zk.entity.Zkvzk;
import com.quanty.cloud.service.zk.mapper.mapper1.ZkvzkMapper;
import com.quanty.cloud.service.zk.service.ZkvzkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import tk.mybatis.mapper.entity.Example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
@Transactional(readOnly = true)
public class ZkvzkServiceImpl implements ZkvzkService {
    @Autowired
    private ZkvzkMapper zkvzkMapper;
    @Override
    @Transactional
    public int insert(Zkvzk zkvzk) {
        return zkvzkMapper.insert(zkvzk);

    }

    @Override
    @Transactional
    public BaseResult updateByZkid(Zkvzk zkvzk) {
       if (zkvzkMapper.updateByZkid(zkvzk)){
           return BaseResult.success("更新数据成功",1);
       } else {
           return BaseResult.fail("更新失败,编号不正确");
       }

    }

    @Override
    public List<Zkvzk> selectAll() {
        return zkvzkMapper.selectAll();
    }

    @Override
    public Zkvzk selectByZkid(String zkid) {
        Example example =new Example(Zkvzk.class);
        example.createCriteria().andEqualTo("zkid",zkid);
        return (Zkvzk) zkvzkMapper.selectOneByExample(example);
    }

    @Override
    @Transactional
    public int deleteByZkid(String zkid) {
        Example example =new Example(Zkvzk.class);
        example.createCriteria().andEqualTo("zkid",zkid);
        return zkvzkMapper.deleteByExample(example);

    }

    /**
     *
     * @param zkids
     * @return
     */
    @Override
    @Transactional
    public int deleteMultiByZkid(String[] zkids) {
        Example example =new Example(Zkvzk.class);
        List<String> ZkidList = new ArrayList<>(Arrays.asList(zkids));
        example.createCriteria().andIn("zkid",ZkidList);
        return zkvzkMapper.deleteByExample(example);

    }
}

package com.quanty.cloud.service.zk.service.impl;

import com.quanty.cloud.common.resposeobject.BaseResult;
import com.quanty.cloud.service.zk.entity.Zkllevelpoint;
import com.quanty.cloud.service.zk.mapper.mapper1.ZkllevelpointMapper;
import com.quanty.cloud.service.zk.service.ZkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import tk.mybatis.mapper.entity.Example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
@Transactional(readOnly = true)
public class ZkServiceImpl implements ZkService {
    @Autowired
    private ZkllevelpointMapper zkllevelpointMapper;

    /**
     * 插入钻孔数据
     * @param zkllevelpoint
     * @return
     */
    @Override
    @Transactional
    public int insert(Zkllevelpoint zkllevelpoint) {

        return zkllevelpointMapper.insert(zkllevelpoint);
    }

    /**
     * 更新某一钻孔单层信息
     * @param zkllevelpoint
     */
    @Override
    @Transactional
    public BaseResult update(Zkllevelpoint zkllevelpoint) {
        if (zkllevelpointMapper.updateZkPoint(zkllevelpoint)){
            return BaseResult.success("更新数据成功",1);
        } else {
            return BaseResult.fail("更新失败,找不到该条数据");
        }


    }

    /**
     * 按照钻孔编号和分层号查询升序排序查询所有数据
     * @return
     */
    @Override
    public List<Zkllevelpoint> selectAllOrderBypkiaaAndDdcdib() {
        return zkllevelpointMapper.selectAllOrderBypkiaaAndDdcdibAsc();
    }

    /**
     * 根据编号查询钻孔数据
     * @param pkiaa 统一编号
     * @return List 钻孔数据集合
     */
    @Override
    public List<Zkllevelpoint>  selectByPkiaa(String pkiaa) {

        Example example =new Example(Zkllevelpoint.class);
        example.createCriteria().andEqualTo("pkiaa",pkiaa);
        return zkllevelpointMapper.selectByExample(example);
    }


    /**
     * 根据编号和地层层序查询某一钻孔点单层数据
     * @param pkiaa 统一编号
     * @param ddcdib 地层层序
     * @return 钻孔单层数据
     */
    @Override
    public Zkllevelpoint selectByPkiaaAndDdcdib(String pkiaa, String ddcdib) {
        Zkllevelpoint zkllevelpoint =null;

        Example example =new Example(Zkllevelpoint.class);
        example.createCriteria().andEqualTo("pkiaa",pkiaa).andEqualTo("ddcdib",ddcdib);
        zkllevelpoint = (Zkllevelpoint) zkllevelpointMapper.selectOneByExample(example);
        return zkllevelpoint;
    }

    /**
     * 根据编号删除某一钻孔点所有数据
     * @param pkiaa
     * @return 删除的记录数
     */
    @Override
    @Transactional
    public int deleteZkDataByPkiaa(String pkiaa) {
        Example example =new Example(Zkllevelpoint.class);
        example.createCriteria().andEqualTo("pkiaa",pkiaa);
        return zkllevelpointMapper.deleteByExample(example);


    }

    /**
     * 根据编号和地层层序删除某一钻孔点单层数据
     * @param pkiaa
     * @param ddcdib
     * @return 删除的记录数
     */
    @Override
    @Transactional
    public int deleteByPkiaaAndDdcdib(String pkiaa, String ddcdib) {
        Example example =new Example(Zkllevelpoint.class);
        example.createCriteria().andEqualTo("pkiaa",pkiaa).andEqualTo("ddcdib",ddcdib);
        return zkllevelpointMapper.deleteByExample(example);

    }

    /**
     * 根据编号批量删除多个钻孔点数据
     * @param pkiaas
     * @return 删除的记录数
     */
    @Override
    @Transactional
    public int deleteMultiZkDataByPkiaas(String[] pkiaas) {
        Example example =new Example(Zkllevelpoint.class);
        List<String> pkiaaList = new ArrayList<>(Arrays.asList(pkiaas));
        example.createCriteria().andIn("pkiaa",pkiaaList);
        return zkllevelpointMapper.deleteByExample(example);
    }


}

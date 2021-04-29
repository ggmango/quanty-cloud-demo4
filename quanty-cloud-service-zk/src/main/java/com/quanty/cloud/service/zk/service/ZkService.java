package com.quanty.cloud.service.zk.service;

import com.quanty.cloud.common.resposeobject.BaseResult;
import com.quanty.cloud.service.zk.entity.Zkllevelpoint;

import java.util.List;

public interface ZkService {

    /**
     * 插入钻孔数据
     * @param zkllevelpoint
     * @return
     */
    int insert(Zkllevelpoint zkllevelpoint);

    /**
     * 更新钻孔数据
     * @param zkllevelpoint
     * @return
     */
    BaseResult update(Zkllevelpoint zkllevelpoint);

    /**
     * 按照钻孔编号和分层号查询升序排序查询所有数据
     * @return List 钻孔数据集合
     */
    List<Zkllevelpoint>selectAllOrderBypkiaaAndDdcdib();

    /**
     * 根据编号查询钻孔数据
     * @param pkiaa 统一编号
     * @return List 钻孔数据集合
     */
    List<Zkllevelpoint>  selectByPkiaa(String pkiaa);

    /**
     * 根据编号和地层层序查询某一钻孔点单层数据
     * @param pkiaa 统一编号
     * @param ddcdib 地层层序
     * @return 钻孔单层数据
     */
    Zkllevelpoint selectByPkiaaAndDdcdib(String pkiaa , String ddcdib);

    /**
     * 根据编号删除某一钻孔点所有数据
     * @param pkiaa
     * @return 删除的记录数
     */
    int deleteZkDataByPkiaa(String pkiaa);

    /**
     * 根据编号和地层层序删除某一钻孔点单层数据
     * @param pkiaa
     * @param ddcdib
     * @return 删除的记录数
     */
    int deleteByPkiaaAndDdcdib(String pkiaa,String ddcdib);

    /**
     * 根据编号批量删除多个钻孔点数据
     * @param pkiaas
     * @return 删除的记录数
     */
    int deleteMultiZkDataByPkiaas(String[] pkiaas);







}

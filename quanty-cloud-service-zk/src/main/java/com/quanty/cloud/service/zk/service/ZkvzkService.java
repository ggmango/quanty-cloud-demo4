package com.quanty.cloud.service.zk.service;

import com.quanty.cloud.common.resposeobject.BaseResult;
import com.quanty.cloud.service.zk.entity.Zkvzk;

import java.util.List;

public interface ZkvzkService {
    /**
     * 新增数据
     * @param zkvzk
     * @return
     */
    int insert(Zkvzk zkvzk);

    /**
     * 更新数据
     * @param zkvzk
     * @return
     */
    BaseResult updateByZkid(Zkvzk zkvzk);

    /**
     * 查询所有数据
     * @return List 数据集合
     */
    List<Zkvzk> selectAll();

    /**
     * 根据zkid查询数据
     * @param zkid
     * @return
     */
    Zkvzk selectByZkid(String zkid );


    /**
     * 根据编号和地层层序删除某一钻孔点单层数据
     * @param zkid
     * @return 删除的记录数
     */
    int deleteByZkid(String zkid);

    /**
     * 根据编号批量删除多个钻孔点数据
     * @param zkid
     * @return 删除的记录数
     */
    int deleteMultiByZkid(String[] zkid);

}

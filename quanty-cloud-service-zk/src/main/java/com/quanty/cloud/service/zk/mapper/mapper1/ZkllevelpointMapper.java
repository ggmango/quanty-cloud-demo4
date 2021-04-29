package com.quanty.cloud.service.zk.mapper.mapper1;

import com.quanty.cloud.service.zk.entity.Zkllevelpoint;
import com.quanty.cloud.service.zk.tkmybatismapper.MyMapper;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface ZkllevelpointMapper extends MyMapper<Zkllevelpoint> {
    /**
     * 更新某条钻孔数据
     * @param zkllevelpoint
     * @return
     */
    Boolean updateZkPoint(Zkllevelpoint zkllevelpoint);

    /**
     * 按照钻孔编号和分层号查询升序排序查询所有数据
     * @return
     */
    List<Zkllevelpoint> selectAllOrderBypkiaaAndDdcdibAsc();
}
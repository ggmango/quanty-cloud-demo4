package com.quanty.cloud.common.zkdto;

import lombok.Data;

import java.math.BigDecimal;

/**
 * @Classname DcDataDto
 * @Description 标准断层数据传输对象
 * @Date 2020/12/3 14:43
 * @Created by willi
 */
@Data
public class StandardFault {
    /**
     * 钻孔编号
     */
    private String gcjcbn;

    /**
     * 分层号
     */
    private String mdloa;

    /**
     *  横坐标
     */
    private BigDecimal hzb;

    /**
     *  纵坐标
     */
    private BigDecimal zzb;

    /**
     * 起始深度
     */
    private BigDecimal startDeep;

    /**
     * 终止深度
     */
    private BigDecimal endDeep;

    /**
     * 夹角
     */
    private BigDecimal angle;

    /**
     * 描述
     */
    private String descript;

}

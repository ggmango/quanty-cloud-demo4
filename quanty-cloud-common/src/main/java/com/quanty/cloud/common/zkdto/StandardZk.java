package com.quanty.cloud.common.zkdto;

import lombok.Data;

import java.math.BigDecimal;

/**
 * @Classname ZkDataDto
 * @Description 标准钻孔数据传输对象
 * @Date 2020/12/3 14:40
 * @Created by willi
 */
@Data
public class StandardZk {
    /**
     * 钻孔编号
     */
    private String gcjcbn;

    /**
     * 分层号
     */
    private String mdloa;

    /**
     * 换层深度
     */
    private BigDecimal hcsd;

    /**
     * 地层代号
     */
    private String dcdh;

    /**
     * 岩石名称
     */
    private String yseb;

    /**
     * X坐标
     */
    private BigDecimal tkcaf;

    /**
     * Y坐标
     */
    private BigDecimal tkcag;

    /**
     * Z坐标
     */
    private BigDecimal tkcai;
    /**
     *  地质描述
     */
    private String descript;


}

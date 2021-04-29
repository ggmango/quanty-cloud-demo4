package com.quanty.cloud.service.zk.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.persistence.*;

public class Zkvzk  {
    @Column(name = "ZKID")
    private String zkid;

    @Column(name = "VZK")
    private String vzk;

    @Column(name = "HZB")
    private BigDecimal hzb;

    @Column(name = "ZZB")
    private BigDecimal zzb;

    @Column(name = "GCJCBL")
    private BigDecimal gcjcbl;

    /**
     * @return ZKID
     */
    public String getZkid() {
        return zkid;
    }

    /**
     * @param zkid
     */
    public void setZkid(String zkid) {
        this.zkid = zkid;
    }

    /**
     * @return VZK
     */
    public String getVzk() {
        return vzk;
    }

    /**
     * @param vzk
     */
    public void setVzk(String vzk) {
        this.vzk = vzk;
    }

    /**
     * @return HZB
     */
    public BigDecimal getHzb() {
        return hzb;
    }

    /**
     * @param hzb
     */
    public void setHzb(BigDecimal hzb) {
        this.hzb = hzb;
    }

    /**
     * @return ZZB
     */
    public BigDecimal getZzb() {
        return zzb;
    }

    /**
     * @param zzb
     */
    public void setZzb(BigDecimal zzb) {
        this.zzb = zzb;
    }

    /**
     * @return GCJCBL
     */
    public BigDecimal getGcjcbl() {
        return gcjcbl;
    }

    /**
     * @param gcjcbl
     */
    public void setGcjcbl(BigDecimal gcjcbl) {
        this.gcjcbl = gcjcbl;
    }
}
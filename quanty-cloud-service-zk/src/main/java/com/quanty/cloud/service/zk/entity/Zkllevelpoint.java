package com.quanty.cloud.service.zk.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.persistence.*;
public class Zkllevelpoint  {
    @Column(name = "PKIAA")
    private String pkiaa;

    @Column(name = "DDCDIB")
    private String ddcdib;

    @Column(name = "DDCDIA")
    private String ddcdia;

    @Column(name = "TKACCL")
    private BigDecimal tkaccl;
    @Column(name = "YSEB")
    private String yseb;

    @Column(name = "GCKLT")
    private String gcklt;

    @Column(name = "DCHD")
    private BigDecimal dchd;

    @Column(name = "DCBZBM")
    private String dcbzbm;

    @Column(name = "DCFCMC")
    private String dcfcmc;

    @Column(name = "DAI")
    private String dai;

    @Column(name = "JI")
    private String ji;

    @Column(name = "SHI")
    private String shi;

    @Column(name = "ZU")
    private String zu;

    @Column(name = "DUAN")
    private String duan;

    @Column(name = "XFCH")
    private String xfch;

    @Column(name = "FZFCH")
    private String fzfch;

    @Column(name = "YSZLZB")
    private BigDecimal yszlzb;

    @Column(name = "TKAJAM")
    private BigDecimal tkajam;

    @Column(name = "CQL")
    private BigDecimal cql;

    @Column(name = "DSF")
    private String dsf;

    @Column(name = "DSBF")
    private String dsbf;

    @Column(name = "YSHFA")
    private String yshfa;

    @Column(name = "DDCDLR")
    private String ddcdlr;

    @Column(name = "YSEBZ")
    private String ysebz;

    @Column(name = "YSD")
    private String ysd;

    @Column(name = "GZBD")
    private String gzbd;

    @Column(name = "KCAJA")
    private String kcaja;

    @Column(name = "QDNGM")
    private String qdngm;

    @Column(name = "GCJLIJ")
    private BigDecimal gcjlij;

    @Column(name = "GGDDIW")
    private String ggddiw;

    @Column(name = "LD")
    private String ld;

    @Column(name = "MYD")
    private String myd;

    @Column(name = "HSX")
    private String hsx;

    @Column(name = "FSX")
    private String fsx;

    @Column(name = "STYHDJ")
    private String styhdj;

    @Column(name = "HSCDM")
    private String hscdm;

    @Column(name = "DZCY")
    private String dzcy;

    @Column(name = "QYLB")
    private String qylb;

    @Column(name = "QYSL")
    private String qysl;

    @Column(name = "YPBH")
    private String ypbh;

    @Column(name = "CSLB")
    private String cslb;

    @Column(name = "CSSL")
    private String cssl;

    @Column(name = "LSH")
    private Integer lsh;

    @Column(name = "CDBG")
    private String cdbg;

    @Column(name = "DZDYGBHDM")
    private String dzdygbhdm;

    @Column(name = "KTYID")
    private String ktyid;

    @Column(name = "TESTXH")
    private String testxh;

    @Column(name = "HZB")
    private BigDecimal hzb;

    @Column(name = "ZZB")
    private BigDecimal zzb;

    @Column(name = "YWBH")
    private String ywbh;

    @Column(name = "YSHB")
    private String yshb;

    @Column(name = "CLGZ")
    private String clgz;

    @Column(name = "BZ")
    private String bz;

    @Column(name = "DZMS")
    private String dzms;

    @Column(name = "YSC")
    private String ysc;

    @Column(name = "KWBGAX")
    private String kwbgax;

    @Column(name = "GCCCA")
    private String gccca;

    @Column(name = "GSAB")
    private String gsab;

    @Column(name = "PKICGA")
    private String pkicga;

    @Column(name = "YSLX")
    private String yslx;

    @Column(name = "ZYKWLX")
    private String zykwlx;

    @Column(name = "ZKSW")
    private String zksw;

    /**
     * @return PKIAA
     */
    public String getPkiaa() {
        return pkiaa;
    }

    /**
     * @param pkiaa
     */
    public void setPkiaa(String pkiaa) {
        this.pkiaa = pkiaa;
    }

    /**
     * @return DDCDIB
     */
    public String getDdcdib() {
        return ddcdib;
    }

    /**
     * @param ddcdib
     */
    public void setDdcdib(String ddcdib) {
        this.ddcdib = ddcdib;
    }

    /**
     * @return DDCDIA
     */
    public String getDdcdia() {
        return ddcdia;
    }

    /**
     * @param ddcdia
     */
    public void setDdcdia(String ddcdia) {
        this.ddcdia = ddcdia;
    }

    /**
     * @return TKACCL
     */
    public BigDecimal getTkaccl() {
        return tkaccl;
    }

    /**
     * @param tkaccl
     */
    public void setTkaccl(BigDecimal tkaccl) {
        this.tkaccl = tkaccl;
    }

    /**
     * @return YSEB
     */
    public String getYseb() {
        return yseb;
    }

    /**
     * @param yseb
     */
    public void setYseb(String yseb) {
        this.yseb = yseb;
    }

    /**
     * @return GCKLT
     */
    public String getGcklt() {
        return gcklt;
    }

    /**
     * @param gcklt
     */
    public void setGcklt(String gcklt) {
        this.gcklt = gcklt;
    }

    /**
     * @return DCHD
     */
    public BigDecimal getDchd() {
        return dchd;
    }

    /**
     * @param dchd
     */
    public void setDchd(BigDecimal dchd) {
        this.dchd = dchd;
    }

    /**
     * @return DCBZBM
     */
    public String getDcbzbm() {
        return dcbzbm;
    }

    /**
     * @param dcbzbm
     */
    public void setDcbzbm(String dcbzbm) {
        this.dcbzbm = dcbzbm;
    }

    /**
     * @return DCFCMC
     */
    public String getDcfcmc() {
        return dcfcmc;
    }

    /**
     * @param dcfcmc
     */
    public void setDcfcmc(String dcfcmc) {
        this.dcfcmc = dcfcmc;
    }

    /**
     * @return DAI
     */
    public String getDai() {
        return dai;
    }

    /**
     * @param dai
     */
    public void setDai(String dai) {
        this.dai = dai;
    }

    /**
     * @return JI
     */
    public String getJi() {
        return ji;
    }

    /**
     * @param ji
     */
    public void setJi(String ji) {
        this.ji = ji;
    }

    /**
     * @return SHI
     */
    public String getShi() {
        return shi;
    }

    /**
     * @param shi
     */
    public void setShi(String shi) {
        this.shi = shi;
    }

    /**
     * @return ZU
     */
    public String getZu() {
        return zu;
    }

    /**
     * @param zu
     */
    public void setZu(String zu) {
        this.zu = zu;
    }

    /**
     * @return DUAN
     */
    public String getDuan() {
        return duan;
    }

    /**
     * @param duan
     */
    public void setDuan(String duan) {
        this.duan = duan;
    }

    /**
     * @return XFCH
     */
    public String getXfch() {
        return xfch;
    }

    /**
     * @param xfch
     */
    public void setXfch(String xfch) {
        this.xfch = xfch;
    }

    /**
     * @return FZFCH
     */
    public String getFzfch() {
        return fzfch;
    }

    /**
     * @param fzfch
     */
    public void setFzfch(String fzfch) {
        this.fzfch = fzfch;
    }

    /**
     * @return YSZLZB
     */
    public BigDecimal getYszlzb() {
        return yszlzb;
    }

    /**
     * @param yszlzb
     */
    public void setYszlzb(BigDecimal yszlzb) {
        this.yszlzb = yszlzb;
    }

    /**
     * @return TKAJAM
     */
    public BigDecimal getTkajam() {
        return tkajam;
    }

    /**
     * @param tkajam
     */
    public void setTkajam(BigDecimal tkajam) {
        this.tkajam = tkajam;
    }

    /**
     * @return CQL
     */
    public BigDecimal getCql() {
        return cql;
    }

    /**
     * @param cql
     */
    public void setCql(BigDecimal cql) {
        this.cql = cql;
    }

    /**
     * @return DSF
     */
    public String getDsf() {
        return dsf;
    }

    /**
     * @param dsf
     */
    public void setDsf(String dsf) {
        this.dsf = dsf;
    }

    /**
     * @return DSBF
     */
    public String getDsbf() {
        return dsbf;
    }

    /**
     * @param dsbf
     */
    public void setDsbf(String dsbf) {
        this.dsbf = dsbf;
    }

    /**
     * @return YSHFA
     */
    public String getYshfa() {
        return yshfa;
    }

    /**
     * @param yshfa
     */
    public void setYshfa(String yshfa) {
        this.yshfa = yshfa;
    }

    /**
     * @return DDCDLR
     */
    public String getDdcdlr() {
        return ddcdlr;
    }

    /**
     * @param ddcdlr
     */
    public void setDdcdlr(String ddcdlr) {
        this.ddcdlr = ddcdlr;
    }

    /**
     * @return YSEBZ
     */
    public String getYsebz() {
        return ysebz;
    }

    /**
     * @param ysebz
     */
    public void setYsebz(String ysebz) {
        this.ysebz = ysebz;
    }

    /**
     * @return YSD
     */
    public String getYsd() {
        return ysd;
    }

    /**
     * @param ysd
     */
    public void setYsd(String ysd) {
        this.ysd = ysd;
    }

    /**
     * @return GZBD
     */
    public String getGzbd() {
        return gzbd;
    }

    /**
     * @param gzbd
     */
    public void setGzbd(String gzbd) {
        this.gzbd = gzbd;
    }

    /**
     * @return KCAJA
     */
    public String getKcaja() {
        return kcaja;
    }

    /**
     * @param kcaja
     */
    public void setKcaja(String kcaja) {
        this.kcaja = kcaja;
    }

    /**
     * @return QDNGM
     */
    public String getQdngm() {
        return qdngm;
    }

    /**
     * @param qdngm
     */
    public void setQdngm(String qdngm) {
        this.qdngm = qdngm;
    }

    /**
     * @return GCJLIJ
     */
    public BigDecimal getGcjlij() {
        return gcjlij;
    }

    /**
     * @param gcjlij
     */
    public void setGcjlij(BigDecimal gcjlij) {
        this.gcjlij = gcjlij;
    }

    /**
     * @return GGDDIW
     */
    public String getGgddiw() {
        return ggddiw;
    }

    /**
     * @param ggddiw
     */
    public void setGgddiw(String ggddiw) {
        this.ggddiw = ggddiw;
    }

    /**
     * @return LD
     */
    public String getLd() {
        return ld;
    }

    /**
     * @param ld
     */
    public void setLd(String ld) {
        this.ld = ld;
    }

    /**
     * @return MYD
     */
    public String getMyd() {
        return myd;
    }

    /**
     * @param myd
     */
    public void setMyd(String myd) {
        this.myd = myd;
    }

    /**
     * @return HSX
     */
    public String getHsx() {
        return hsx;
    }

    /**
     * @param hsx
     */
    public void setHsx(String hsx) {
        this.hsx = hsx;
    }

    /**
     * @return FSX
     */
    public String getFsx() {
        return fsx;
    }

    /**
     * @param fsx
     */
    public void setFsx(String fsx) {
        this.fsx = fsx;
    }

    /**
     * @return STYHDJ
     */
    public String getStyhdj() {
        return styhdj;
    }

    /**
     * @param styhdj
     */
    public void setStyhdj(String styhdj) {
        this.styhdj = styhdj;
    }

    /**
     * @return HSCDM
     */
    public String getHscdm() {
        return hscdm;
    }

    /**
     * @param hscdm
     */
    public void setHscdm(String hscdm) {
        this.hscdm = hscdm;
    }

    /**
     * @return DZCY
     */
    public String getDzcy() {
        return dzcy;
    }

    /**
     * @param dzcy
     */
    public void setDzcy(String dzcy) {
        this.dzcy = dzcy;
    }

    /**
     * @return QYLB
     */
    public String getQylb() {
        return qylb;
    }

    /**
     * @param qylb
     */
    public void setQylb(String qylb) {
        this.qylb = qylb;
    }

    /**
     * @return QYSL
     */
    public String getQysl() {
        return qysl;
    }

    /**
     * @param qysl
     */
    public void setQysl(String qysl) {
        this.qysl = qysl;
    }

    /**
     * @return YPBH
     */
    public String getYpbh() {
        return ypbh;
    }

    /**
     * @param ypbh
     */
    public void setYpbh(String ypbh) {
        this.ypbh = ypbh;
    }

    /**
     * @return CSLB
     */
    public String getCslb() {
        return cslb;
    }

    /**
     * @param cslb
     */
    public void setCslb(String cslb) {
        this.cslb = cslb;
    }

    /**
     * @return CSSL
     */
    public String getCssl() {
        return cssl;
    }

    /**
     * @param cssl
     */
    public void setCssl(String cssl) {
        this.cssl = cssl;
    }

    /**
     * @return LSH
     */
    public Integer getLsh() {
        return lsh;
    }

    /**
     * @param lsh
     */
    public void setLsh(Integer lsh) {
        this.lsh = lsh;
    }

    /**
     * @return CDBG
     */
    public String getCdbg() {
        return cdbg;
    }

    /**
     * @param cdbg
     */
    public void setCdbg(String cdbg) {
        this.cdbg = cdbg;
    }

    /**
     * @return DZDYGBHDM
     */
    public String getDzdygbhdm() {
        return dzdygbhdm;
    }

    /**
     * @param dzdygbhdm
     */
    public void setDzdygbhdm(String dzdygbhdm) {
        this.dzdygbhdm = dzdygbhdm;
    }

    /**
     * @return KTYID
     */
    public String getKtyid() {
        return ktyid;
    }

    /**
     * @param ktyid
     */
    public void setKtyid(String ktyid) {
        this.ktyid = ktyid;
    }

    /**
     * @return TESTXH
     */
    public String getTestxh() {
        return testxh;
    }

    /**
     * @param testxh
     */
    public void setTestxh(String testxh) {
        this.testxh = testxh;
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
     * @return YWBH
     */
    public String getYwbh() {
        return ywbh;
    }

    /**
     * @param ywbh
     */
    public void setYwbh(String ywbh) {
        this.ywbh = ywbh;
    }

    /**
     * @return YSHB
     */
    public String getYshb() {
        return yshb;
    }

    /**
     * @param yshb
     */
    public void setYshb(String yshb) {
        this.yshb = yshb;
    }

    /**
     * @return CLGZ
     */
    public String getClgz() {
        return clgz;
    }

    /**
     * @param clgz
     */
    public void setClgz(String clgz) {
        this.clgz = clgz;
    }

    /**
     * @return BZ
     */
    public String getBz() {
        return bz;
    }

    /**
     * @param bz
     */
    public void setBz(String bz) {
        this.bz = bz;
    }

    /**
     * @return DZMS
     */
    public String getDzms() {
        return dzms;
    }

    /**
     * @param dzms
     */
    public void setDzms(String dzms) {
        this.dzms = dzms;
    }

    /**
     * @return YSC
     */
    public String getYsc() {
        return ysc;
    }

    /**
     * @param ysc
     */
    public void setYsc(String ysc) {
        this.ysc = ysc;
    }

    /**
     * @return KWBGAX
     */
    public String getKwbgax() {
        return kwbgax;
    }

    /**
     * @param kwbgax
     */
    public void setKwbgax(String kwbgax) {
        this.kwbgax = kwbgax;
    }

    /**
     * @return GCCCA
     */
    public String getGccca() {
        return gccca;
    }

    /**
     * @param gccca
     */
    public void setGccca(String gccca) {
        this.gccca = gccca;
    }

    /**
     * @return GSAB
     */
    public String getGsab() {
        return gsab;
    }

    /**
     * @param gsab
     */
    public void setGsab(String gsab) {
        this.gsab = gsab;
    }

    /**
     * @return PKICGA
     */
    public String getPkicga() {
        return pkicga;
    }

    /**
     * @param pkicga
     */
    public void setPkicga(String pkicga) {
        this.pkicga = pkicga;
    }

    /**
     * @return YSLX
     */
    public String getYslx() {
        return yslx;
    }

    /**
     * @param yslx
     */
    public void setYslx(String yslx) {
        this.yslx = yslx;
    }

    /**
     * @return ZYKWLX
     */
    public String getZykwlx() {
        return zykwlx;
    }

    /**
     * @param zykwlx
     */
    public void setZykwlx(String zykwlx) {
        this.zykwlx = zykwlx;
    }

    /**
     * @return ZKSW
     */
    public String getZksw() {
        return zksw;
    }

    /**
     * @param zksw
     */
    public void setZksw(String zksw) {
        this.zksw = zksw;
    }
}
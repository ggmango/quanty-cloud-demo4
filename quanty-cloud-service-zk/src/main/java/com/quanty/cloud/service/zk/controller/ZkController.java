package com.quanty.cloud.service.zk.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.quanty.cloud.common.resposeobject.BaseResult;
import com.quanty.cloud.common.utils.GaussXYDeal;
import com.quanty.cloud.common.zkdto.StandardFault;
import com.quanty.cloud.common.zkdto.StandardZk;
import com.quanty.cloud.service.zk.entity.User;
import com.quanty.cloud.service.zk.entity.Zkllevelpoint;
import com.quanty.cloud.service.zk.entity.fault.Fault;
import com.quanty.cloud.service.zk.service.FaultService;
import com.quanty.cloud.service.zk.service.UserService;
import com.quanty.cloud.service.zk.service.ZkService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Random;

/**
 *钻孔数据管理
 */
@Api(tags = "钻孔采样数据接口")
@RequestMapping("v1/zkdata")
@RestController
public class ZkController {
    @Autowired
    private ZkService zkService;
    @Autowired
    private FaultService faultService;
    @Autowired
    private UserService userService;
   //ApplicationContext applicationContext  = new  ClassPathXmlApplicationContext("test.xml")
    /**
     * 查询所有钻孔数据
     * @return
     */
    @ApiOperation("查询所有钻孔采样点的数据")
    @GetMapping(value = "findall",produces = { "application/json;charset=UTF-8" })
    public BaseResult selectAll(){
        List<Zkllevelpoint> zkllevelpointList = zkService.selectAllOrderBypkiaaAndDdcdib();
        List<StandardZk> standardZkList =new ArrayList<>();

        //转换成标准钻孔数据对象进行传输
        transformData(zkllevelpointList,standardZkList);
        //Map<String,List<StandardZk>> stringListMap =standardZkList.stream().collect(groupingBy(StandardZk::getGcjcbn));
        //System.out.println(stringListMap.toString());
        return BaseResult.success("查询成功",standardZkList.size(),standardZkList);
    }

    /**
     * 分页查询
     * @param pageNum 分页起始页
     * @param pageSize 每页显示记录数
     * @return
     */
    @ApiOperation("分页查询")
    @GetMapping(value = "findallbypage",produces = {"application/json;charset=UTF-8"})
    public  BaseResult page( @RequestParam(defaultValue = "1",required = false) Integer pageNum,@RequestParam(defaultValue = "10",required = false) Integer pageSize){
        //设置分页查询条件
        PageHelper.startPage(pageNum,pageSize);

        List<StandardZk> standardZkList = new ArrayList<>();
        PageInfo<Zkllevelpoint> pageInfo = new PageInfo<>(zkService.selectAllOrderBypkiaaAndDdcdib());
        List<Zkllevelpoint> pageInfoList = pageInfo.getList();
        //转换成标准钻孔数据对象进行传输
        transformData(pageInfoList,standardZkList);
        return BaseResult.success("查询成功",standardZkList.size(),standardZkList);
    }

    /**
     * 查询某一编号下的钻孔数据
     * @param pkiaa 统一编号
     * @return
     */
    @ApiOperation("查询某个钻孔采样点的数据")
    @GetMapping(value = "findone/{pkiaa}",produces = { "application/json;charset=UTF-8" })
    public BaseResult selectByPkiaa(@PathVariable String pkiaa){
        List<Zkllevelpoint> zkllevelpointList = zkService.selectByPkiaa(pkiaa);
        List<StandardZk> standardZkList = new ArrayList<>();
        int count =zkllevelpointList.size();
        Map<String,BigDecimal> map;
        if (count ==0){
            return BaseResult.fail("找不到该编号的钻孔数据");
        } else {
            //转换成标准钻孔数据对象进行传输
            transformData(zkllevelpointList,standardZkList);
            return BaseResult.success("查询成功",count,standardZkList);
        }

    }

    /**
     * 查询某一编号下的单层钻孔数据
     * @param pkiaa 统一编号
     * @param ddcdib  地层层序
     * @return
     */
    @ApiOperation("查询某个钻孔采样点某一地层的数据")
    @GetMapping(value = "findone/{pkiaa}/{ddcdib}",produces = { "application/json;charset=UTF-8" })
    public BaseResult selectByPkiaaAndDdcdib(@PathVariable String pkiaa, @PathVariable String ddcdib){
        Zkllevelpoint zkllevelpoint = zkService.selectByPkiaaAndDdcdib(pkiaa,ddcdib);
        StandardZk standardZk = new StandardZk();
        //查询失败
        if (zkllevelpoint == null){
           return BaseResult.fail("找不到该条数据,请输入正确的统一编号和地层层序");
        //查询成功
        } else {
            Map<String,BigDecimal> map= GaussXYDeal.GaussToBL(zkllevelpoint.getHzb(),zkllevelpoint.getZzb());
            zkllevelpoint.setHzb(map.get("hzb").setScale(10,BigDecimal.ROUND_HALF_UP));
            zkllevelpoint.setZzb(map.get("zzb").setScale(10,BigDecimal.ROUND_HALF_UP));
            //转换成标准钻孔数据传输对象
            standardZk = transforToStandardZk(zkllevelpoint);

            return BaseResult.success("查询成功",1,standardZk);
        }
    }

    /**
     * 删除指定编号钻孔的所有数据
     * @param pkiaa 统一编号
     * @return
     */
    @ApiOperation("删除某个钻孔采样点的数据")
    @DeleteMapping("deleteone/{pkiaa}")
    public BaseResult deleteByPkiaa(@PathVariable String pkiaa){
        //返回操作的记录数
        int count =zkService.deleteZkDataByPkiaa(pkiaa) ;
        //删除失败
        if (count==0){
            return BaseResult.fail("操作失败,请输入正确的统一编号");
        //删除成功
        } else {
            return BaseResult.success("操作成功,一共删除了"+count+"条数据",count);
        }

    }

    /**
     * 删除一条数据
     * @param pkiaa 统一编号
     * @param ddcdib 地层层序
     * @return
     */
    @ApiOperation("删除某个钻孔采样点某一地层的数据")
    @DeleteMapping("deleteone/{pkiaa}/{ddcdib}")
    public BaseResult deleteByPkiaaAndDdcdib(@PathVariable String pkiaa, @PathVariable String ddcdib){
        int count =zkService.deleteByPkiaaAndDdcdib(pkiaa,ddcdib);
        //删除失败
        if (count==0){
            return BaseResult.fail("操作失败,请输入正确的统一编号和地层层序");
        //删除成功
        } else {
            return BaseResult.success("操作成功,一共删除了"+count+"条数据",count);
        }

    }

    /**
     * 批量删除数据
     * @param ids 统一编号字符串数组
     * @return
     */
    @ApiOperation("批量删除多个钻孔采样点数据")
    @DeleteMapping("deletemulit")
    public BaseResult deleteByPkiaas(String ids){
        //将前端传过来的ids字符串转换成字符串数组pkiaas
        String[] pkiaas = StringUtils.split(ids,",");

        //返回操作的记录数
        int count =zkService.deleteMultiZkDataByPkiaas(pkiaas);
        //删除失败
        if (count==0){
            return BaseResult.fail("操作失败,请输入正确的统一编号");
        //删除成功
        } else {
            return BaseResult.success("操作成功,一共删除了"+count+"条数据",count);
        }

    }

    /**
     * 添加一条数据
     * @param zkllevelpoint 一条钻孔数据
     * @return
     */
    @ApiOperation("添加一条钻孔采样点某一地层的数据")
    @PostMapping("addone")
    public BaseResult addOne(@RequestBody Zkllevelpoint zkllevelpoint){

        if(zkService.selectByPkiaaAndDdcdib(zkllevelpoint.getPkiaa(), zkllevelpoint.getDdcdib()) != null) {
            return BaseResult.fail("该条数据已存在,添加失败");
        } else {
            int count = zkService.insert(zkllevelpoint);
            if (count ==1){
                return BaseResult.success("操作成功,已添加"+count+"条数据",count);
            } else {
                return BaseResult.fail("操作失败");

            }

        }

    }

    /**
     * 更新一条数据
     * @param zkllevelpoint  一条钻孔数据
     * @return
     */
    @ApiOperation("更新一条钻孔采样点某一地层的数据")
    @PutMapping("updateone")
    public BaseResult updateOne(@RequestBody Zkllevelpoint zkllevelpoint){
        return zkService.update(zkllevelpoint);
    }

    /**
     * 钻孔数据属性复制
     * @param zkllevelpoint
     * @return
     */
    public StandardZk transforToStandardZk(Zkllevelpoint zkllevelpoint){
        StandardZk standardZk = new StandardZk();
        if (zkllevelpoint ==null){
            return null;
        } else {
            standardZk=new StandardZk();
            standardZk.setGcjcbn(zkllevelpoint.getPkiaa());
            standardZk.setMdloa(zkllevelpoint.getDdcdib());
            standardZk.setHcsd(zkllevelpoint.getTkaccl());
            standardZk.setDcdh(zkllevelpoint.getDcfcmc());
            standardZk.setYseb(zkllevelpoint.getYseb());
            standardZk.setTkcaf(zkllevelpoint.getHzb());
            standardZk.setTkcag(zkllevelpoint.getZzb());
            standardZk.setTkcai(null);
            standardZk.setDescript(zkllevelpoint.getGcklt());
        }
        return standardZk;

    }

    /**
     * XY坐标转换及精度截取
     * @param zkllevelpointList 原始钻孔数据
     * @param standardZkList    标准钻孔传输数据
     */
    private void transformData(List<Zkllevelpoint> zkllevelpointList,List<StandardZk> standardZkList) {
        Map<String, BigDecimal> map;
        for (Zkllevelpoint zkllevelpoint : zkllevelpointList) {
            map= GaussXYDeal.GaussToBL(zkllevelpoint.getHzb(),zkllevelpoint.getZzb());
            zkllevelpoint.setHzb(map.get("hzb").setScale(10, BigDecimal.ROUND_HALF_UP));
            zkllevelpoint.setZzb(map.get("zzb").setScale(10,BigDecimal.ROUND_HALF_UP));
            standardZkList.add(transforToStandardZk(zkllevelpoint));
        }
    }

    /**
     * 测试多数据源的配置
     * @return
     */
    @GetMapping("/findalluser")
    public BaseResult findalluser(){
        List<User> users = userService.findallUser();
        return BaseResult.success("ok",users);

    }

    /**
     * 查询所有断层数据
     * @return
     */
    @GetMapping("findallfault")
    public BaseResult findallFalut(){
        List<Fault> faults = faultService.findallFault();
        List<StandardFault> standardFaults =new ArrayList<>();
        Map<String, BigDecimal> map;
        for (Fault fault : faults) {
            map= GaussXYDeal.GaussToBL(fault.getHzb(),fault.getZzb());
            fault.setHzb(map.get("hzb").setScale(10, BigDecimal.ROUND_HALF_UP));
            fault.setZzb(map.get("zzb").setScale(10,BigDecimal.ROUND_HALF_UP));
            StandardFault standardFault =new StandardFault();
            standardFault.setGcjcbn(fault.getPkiaa());
            standardFault.setMdloa(fault.getDdcdib());
            standardFault.setStartDeep(fault.getTkaccl().subtract(fault.getDchd()));
            standardFault.setEndDeep(fault.getTkaccl());
            standardFault.setDescript(fault.getGcklt());
            standardFault.setHzb(fault.getHzb());
            standardFault.setZzb(fault.getZzb());
            standardFault.setAngle(BigDecimal.valueOf(new Random().nextFloat() * 30).setScale(10, RoundingMode.HALF_UP));
            standardFaults.add(standardFault);

        }
        return BaseResult.success("断层数据查询成功",faults.size(),standardFaults);


    }

}

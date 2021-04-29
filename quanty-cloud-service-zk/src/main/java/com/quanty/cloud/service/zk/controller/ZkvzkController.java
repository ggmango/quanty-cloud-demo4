package com.quanty.cloud.service.zk.controller;

import com.quanty.cloud.common.resposeobject.BaseResult;
import com.quanty.cloud.service.zk.entity.Zkvzk;
import com.quanty.cloud.service.zk.service.ZkvzkService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Api(tags = "钻孔点分布数据接口")
@RestController
@RequestMapping("v1/zkvzkdata")
public class ZkvzkController {
    @Autowired
    private ZkvzkService zkvzkService;

    /**
     * 查询所有数据
     *
     * @return
     */
    @ApiOperation("查询所有钻孔点的信息")
    @GetMapping(value = "findall", produces = {"application/json;charset=UTF-8"})
    public BaseResult selectAll() {

        List<Zkvzk> zkvzkList = zkvzkService.selectAll();
        if (zkvzkList == null) {
            return BaseResult.fail("网络异常，请稍候再试");
        } else {
            int count = zkvzkList.size();
            return BaseResult.success("查询操作成功", count, zkvzkList);
        }


    }

    /**
     * 查询某一编号下的数据
     *
     * @param zkid 编号
     * @return
     */
    @ApiOperation("查询某个钻孔点的信息")
    @GetMapping(value = "findone/{zkid}", produces = {"application/json;charset=UTF-8"})
    public BaseResult selectByZkid(@PathVariable String zkid) {
        Zkvzk zkvzk = zkvzkService.selectByZkid(zkid);
        if (zkvzk == null) {
            return BaseResult.success("查询失败,请输入正确的编号", 0);
        } else {
            return BaseResult.success("查询操作成功", 1, zkvzk);
        }

    }

    /**
     * 删除指定编号的所有数据
     *
     * @param zkid
     * @return
     */
    @ApiOperation("删除某个钻孔点的信息")
    @DeleteMapping("deleteone/{zkid}")
    public BaseResult deleteByZkid(@PathVariable String zkid) {

        int count = zkvzkService.deleteByZkid(zkid);
        if (count == 0) {
            return BaseResult.fail("操作失败,请输入正确的编号");

        } else {
            return BaseResult.success("操作成功,一共删除了" + count + "条数据", count);
        }

    }


    /**
     * 批量删除数据
     *
     * @param ids 统一编号字符串数组
     * @return
     */
    @ApiOperation("删除多个钻孔点的信息")
    @DeleteMapping("deletemulit")
    public BaseResult deleteByZkids(@RequestParam String ids) {
        String[] Zkids = StringUtils.split(ids,",");
        int count = zkvzkService.deleteMultiByZkid(Zkids);
        if (count == 0) {
            return BaseResult.fail("操作失败,请输入正确的统一编号组");

        } else {
            return BaseResult.success("操作成功,一共删除了" + count + "条数据", count);
        }


    }

    /**
     * 添加一条数据
     *
     * @param zkvzk
     * @return
     */
    @ApiOperation("添加一个钻孔点的信息")
    @PostMapping("addone")
    public BaseResult addOne(@RequestBody Zkvzk zkvzk) {

        if (zkvzkService.selectByZkid(zkvzk.getZkid()) != null) {
            return BaseResult.fail("该编号已存在,请设定新的编号");
        } else {
            int count = zkvzkService.insert(zkvzk);
            if (count == 1) {
                return BaseResult.success("操作成功,已添加" + count + "条数据", count);
            } else {
                return BaseResult.fail("操作失败");
            }

        }


    }

    /**
     * 更新一条数据
     *
     * @param zkvzk
     * @return
     */
    @ApiOperation("更新一个钻孔点的信息")
    @PutMapping("updateone")
    public BaseResult updateOne(@RequestBody Zkvzk zkvzk) {

        return zkvzkService.updateByZkid(zkvzk);

    }
}

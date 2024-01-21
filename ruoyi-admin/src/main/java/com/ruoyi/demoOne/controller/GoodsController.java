package com.ruoyi.demoOne.controller;

import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.demoOne.dao.entiy.Goods;
import com.ruoyi.demoOne.dto.req.ReqGoods;
import com.ruoyi.demoOne.result.Result;
import com.ruoyi.demoOne.service.GoodsService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Objects;

/**
 * ClassName: GoodsController
 * Package: com.ruoyi.demoOne.controller
 * Description:
 *
 * @Author 李玉龙
 * @Create 2024/1/20 16:28
 * @Version 1.0
 */
@RestController
public class GoodsController {
    @Autowired
    GoodsService goodsService;
    @GetMapping("/goods")
    @ApiOperation("获取在售商品列表")
    public AjaxResult getGoods(){
        return AjaxResult.success(goodsService.getGoods());
    }
    @PostMapping("/goods")
    @ApiOperation("新增商品")
    public AjaxResult save(@RequestBody ReqGoods params){
        return AjaxResult.success(goodsService.save(params));
    }
    @PutMapping("/goods")
    @ApiOperation("修改商品")
    public AjaxResult update(@RequestBody Goods params){
        return AjaxResult.success(goodsService.update(params));
    }
    @GetMapping("/goods/{id}")
    @ApiOperation("根据ID获取商品信息")
    public AjaxResult getOne(@PathVariable Integer id){
        return AjaxResult.success(goodsService.getOne(id)) ;
    }
    @DeleteMapping("/goods/{id}")
    @ApiOperation("删除指定ID商品")
    public AjaxResult delete(@PathVariable Integer id){
        goodsService.delete(id);
        return AjaxResult.success();
    }
}

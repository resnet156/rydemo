package com.ruoyi.demoOne.service;

import com.ruoyi.demoOne.dao.entiy.Goods;
import com.ruoyi.demoOne.dto.req.ReqGoods;
import com.ruoyi.demoOne.result.Result;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

/**
 * ClassName: GoodsService
 * Package: com.ruoyi.demoOne.service.impl
 * Description:
 *
 * @Author 李玉龙
 * @Create 2024/1/20 20:13
 * @Version 1.0
 */
public interface GoodsService {
    /**
     * 获取在售商品列表
     * @return
     */
    public List<Goods> getGoods();

    /**
     * 新增商品
     * @param params
     * @return
     */
    public Goods save(ReqGoods params);

    /**
     * 修改商品
     * @param params
     * @return
     */
    public Goods update(Goods params);

    /**
     * 根据ID获取商品信息
     * @param id
     * @return
     */
    public Goods getOne(Integer id);

    /**
     * 删除指定ID商品
     * @param id
     */
    public void delete(Integer id);
}

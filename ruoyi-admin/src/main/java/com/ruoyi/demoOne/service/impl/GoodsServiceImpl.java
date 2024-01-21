package com.ruoyi.demoOne.service.impl;

import com.ruoyi.demoOne.dao.entiy.Goods;
import com.ruoyi.demoOne.dao.mapper.GoodsMapper;
import com.ruoyi.demoOne.dto.req.ReqGoods;
import com.ruoyi.demoOne.service.GoodsService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * ClassName: GoodsServiceImpl
 * Package: com.ruoyi.demoOne.service.impl
 * Description:
 *
 * @Author 李玉龙
 * @Create 2024/1/20 20:13
 * @Version 1.0
 */
@Service
public class GoodsServiceImpl implements GoodsService {
    @Autowired
    GoodsMapper goodsMapper;
    /**
     * 获取在售商品列表
     *
     * @return
     */
    @Override
    public List<Goods> getGoods() {
        return goodsMapper.getGoods();
    }

    /**
     * 新增商品
     *
     * @param params
     * @return
     */
    @Override
    public Goods save(ReqGoods params) {
        Goods goods = new Goods();
        BeanUtils.copyProperties(params,goods);
        goodsMapper.save(goods);
        return goods;
    }

    /**
     * 修改商品
     *
     * @param params
     * @return
     */
    @Override
    public Goods update(Goods params) {
        if (goodsMapper.getOne(params.getId().intValue()) == null){
            return params;
        }
        return params;
    }

    /**
     * 根据ID获取商品信息
     *
     * @param id
     * @return
     */
    @Override
    public Goods getOne(Integer id) {
        return goodsMapper.getOne(id);
    }

    /**
     * 删除指定ID商品
     *
     * @param id
     */
    @Override
    public void delete(Integer id) {
        if (goodsMapper.getOne(id.intValue()) == null){
            return;
        }
        goodsMapper.delete(id);
    }
}

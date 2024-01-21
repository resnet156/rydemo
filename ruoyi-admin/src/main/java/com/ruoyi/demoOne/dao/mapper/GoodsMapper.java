package com.ruoyi.demoOne.dao.mapper;

import com.ruoyi.demoOne.dao.entiy.Goods;
import com.ruoyi.demoOne.dto.req.ReqGoods;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * ClassName: GoodsMapper
 * Package: com.ruoyi.demoOne.dao.mapper
 * Description:
 *
 * @Author 李玉龙
 * @Create 2024/1/20 20:13
 * @Version 1.0
 */
@Mapper
public interface GoodsMapper {
    /**
     * 获取在售商品列表
     * @return
     */
    List<Goods> getGoods();

    /**
     * 新增商品
     * @param params
     * @return
     */
    public void save(@Param("params") Goods params);

    /**
     * 修改商品
     * @param params
     * @return
     */
    void update(@Param("params") Goods params);

    /**
     * 根据ID获取商品信息
     * @param id
     * @return
     */
    Goods getOne(@Param("id") Integer id);

    /**
     * 删除指定ID商品
     * @param id
     */
    void delete(@Param("id") Integer id);
}

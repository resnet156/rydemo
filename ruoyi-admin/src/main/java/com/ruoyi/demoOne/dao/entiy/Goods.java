package com.ruoyi.demoOne.dao.entiy;

import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import java.util.Objects;

/**
 * 商品对象 goods
 */
@ApiModel(value = "Goods",description = "商品模型")
public class Goods
{

    /** 商品ID */
    @ApiModelProperty(value = "商品ID")
    private Long id;

    /** 商品名称 */
    @ApiModelProperty(value = "商品名称")
    private String name;

    /** 商品价格 */
    @ApiModelProperty(value = "商品价格")
    private Long price;

    /** 商品状态：在售|售罄 */
    @ApiModelProperty(value = "商品状态：在售|售罄")
    private String status;

    /** 商品类型 */
    @ApiModelProperty("商品类型")
    private String type;

    public Goods() {
    }

    public Goods(String name, Long price, String status, String type) {
        this.name = name;
        this.price = price;
        this.status = status;
        this.type = type;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getPrice() {
        return price;
    }

    public void setPrice(Long price) {
        this.price = price;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Goods goods = (Goods) o;
        return Objects.equals(id, goods.id) && Objects.equals(name, goods.name) && Objects.equals(price, goods.price) && Objects.equals(status, goods.status) && Objects.equals(type, goods.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, price, status, type);
    }

    @Override
    public String toString() {
        return "Goods{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", status='" + status + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}

package com.ruoyi.demoOne.dto.req;

import io.swagger.annotations.ApiModelProperty;

import java.util.Objects;

/**
 * ClassName: ReqGoods
 * Package: com.ruoyi.demoOne.dto.req
 * Description:
 *
 * @Author 李玉龙
 * @Create 2024/1/20 20:05
 * @Version 1.0
 */
public class ReqGoods {
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

    public ReqGoods() {
    }

    public ReqGoods(String name, Long price, String status, String type) {
        this.name = name;
        this.price = price;
        this.status = status;
        this.type = type;
    }

    @Override
    public String toString() {
        return "ReqGoods{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", status='" + status + '\'' +
                ", type='" + type + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ReqGoods reqGoods = (ReqGoods) o;
        return Objects.equals(name, reqGoods.name) && Objects.equals(price, reqGoods.price) && Objects.equals(status, reqGoods.status) && Objects.equals(type, reqGoods.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, price, status, type);
    }
}

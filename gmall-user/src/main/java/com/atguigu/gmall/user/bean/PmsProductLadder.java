package com.atguigu.gmall.user.bean;

import java.math.BigDecimal;

public class PmsProductLadder {
    private Long id;

    private Long productId;

    /**
    * 满足的商品数量
    */
    private Integer count;

    /**
    * 折扣
    */
    private BigDecimal discount;

    /**
    * 折后价格
    */
    private BigDecimal price;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public BigDecimal getDiscount() {
        return discount;
    }

    public void setDiscount(BigDecimal discount) {
        this.discount = discount;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }
}
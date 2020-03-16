package com.atguigu.gmall.user.bean;

import java.math.BigDecimal;

public class SmsFlashPromotionProductRelation {
    /**
    * 编号
    */
    private Long id;

    private Integer flashPromotionId;

    /**
    * 编号
    */
    private Long flashPromotionSessionId;

    private Long productId;

    /**
    * 限时购价格
    */
    private BigDecimal flashPromotionPrice;

    /**
    * 限时购数量
    */
    private Integer flashPromotionCount;

    /**
    * 每人限购数量
    */
    private Integer flashPromotionLimit;

    /**
    * 排序
    */
    private Integer sort;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getFlashPromotionId() {
        return flashPromotionId;
    }

    public void setFlashPromotionId(Integer flashPromotionId) {
        this.flashPromotionId = flashPromotionId;
    }

    public Long getFlashPromotionSessionId() {
        return flashPromotionSessionId;
    }

    public void setFlashPromotionSessionId(Long flashPromotionSessionId) {
        this.flashPromotionSessionId = flashPromotionSessionId;
    }

    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public BigDecimal getFlashPromotionPrice() {
        return flashPromotionPrice;
    }

    public void setFlashPromotionPrice(BigDecimal flashPromotionPrice) {
        this.flashPromotionPrice = flashPromotionPrice;
    }

    public Integer getFlashPromotionCount() {
        return flashPromotionCount;
    }

    public void setFlashPromotionCount(Integer flashPromotionCount) {
        this.flashPromotionCount = flashPromotionCount;
    }

    public Integer getFlashPromotionLimit() {
        return flashPromotionLimit;
    }

    public void setFlashPromotionLimit(Integer flashPromotionLimit) {
        this.flashPromotionLimit = flashPromotionLimit;
    }

    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }
}
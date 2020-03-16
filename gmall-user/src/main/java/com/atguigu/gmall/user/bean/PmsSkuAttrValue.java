package com.atguigu.gmall.user.bean;

public class PmsSkuAttrValue {
    /**
    * 编号
    */
    private Long id;

    /**
    * 属性id（冗余)
    */
    private Integer attrId;

    /**
    * 属性值id
    */
    private Long valueId;

    /**
    * skuid
    */
    private Integer skuId;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getAttrId() {
        return attrId;
    }

    public void setAttrId(Integer attrId) {
        this.attrId = attrId;
    }

    public Long getValueId() {
        return valueId;
    }

    public void setValueId(Long valueId) {
        this.valueId = valueId;
    }

    public Integer getSkuId() {
        return skuId;
    }

    public void setSkuId(Integer skuId) {
        this.skuId = skuId;
    }
}
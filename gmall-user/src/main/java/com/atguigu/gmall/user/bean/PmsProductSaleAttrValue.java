package com.atguigu.gmall.user.bean;

public class PmsProductSaleAttrValue {
    /**
    * id
    */
    private Long id;

    /**
    * 商品id
    */
    private Integer productId;

    /**
    * 销售属性id
    */
    private Long saleAttrId;

    /**
    * 销售属性值名称
    */
    private String saleAttrValueName;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public Long getSaleAttrId() {
        return saleAttrId;
    }

    public void setSaleAttrId(Long saleAttrId) {
        this.saleAttrId = saleAttrId;
    }

    public String getSaleAttrValueName() {
        return saleAttrValueName;
    }

    public void setSaleAttrValueName(String saleAttrValueName) {
        this.saleAttrValueName = saleAttrValueName;
    }
}
package com.atguigu.gmall.user.bean;

public class PmsProductImage {
    /**
    * 编号
    */
    private Long id;

    /**
    * 商品id
    */
    private Integer productId;

    /**
    * 图片名称
    */
    private String imgName;

    /**
    * 图片路径
    */
    private String imgUrl;

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

    public String getImgName() {
        return imgName;
    }

    public void setImgName(String imgName) {
        this.imgName = imgName;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }
}
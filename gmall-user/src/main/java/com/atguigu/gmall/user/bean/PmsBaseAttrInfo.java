package com.atguigu.gmall.user.bean;

public class PmsBaseAttrInfo {
    /**
    * 编号
    */
    private Integer id;

    /**
    * 属性名称
    */
    private String attrName;

    private Long catalog3Id;

    /**
    * 启用：1 停用：0
    */
    private String isEnabled;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAttrName() {
        return attrName;
    }

    public void setAttrName(String attrName) {
        this.attrName = attrName;
    }

    public Long getCatalog3Id() {
        return catalog3Id;
    }

    public void setCatalog3Id(Long catalog3Id) {
        this.catalog3Id = catalog3Id;
    }

    public String getIsEnabled() {
        return isEnabled;
    }

    public void setIsEnabled(String isEnabled) {
        this.isEnabled = isEnabled;
    }
}
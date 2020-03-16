package com.atguigu.gmall.user.bean;

public class WmsWareOrderTaskDetail {
    /**
    * 编号
    */
    private Long id;

    /**
    * sku_id
    */
    private Integer skuId;

    /**
    * sku名称
    */
    private String skuName;

    /**
    * 购买个数
    */
    private Integer skuNums;

    /**
    * 工作单编号
    */
    private Long taskId;

    private Integer skuNum;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getSkuId() {
        return skuId;
    }

    public void setSkuId(Integer skuId) {
        this.skuId = skuId;
    }

    public String getSkuName() {
        return skuName;
    }

    public void setSkuName(String skuName) {
        this.skuName = skuName;
    }

    public Integer getSkuNums() {
        return skuNums;
    }

    public void setSkuNums(Integer skuNums) {
        this.skuNums = skuNums;
    }

    public Long getTaskId() {
        return taskId;
    }

    public void setTaskId(Long taskId) {
        this.taskId = taskId;
    }

    public Integer getSkuNum() {
        return skuNum;
    }

    public void setSkuNum(Integer skuNum) {
        this.skuNum = skuNum;
    }
}
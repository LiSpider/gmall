package com.atguigu.gmall.user.bean;

public class WmsWareSku {
    /**
    * 编号
    */
    private Long id;

    /**
    * skuid
    */
    private Long skuId;

    /**
    * 仓库id
    */
    private Long warehouseId;

    /**
    * 库存数
    */
    private Integer stock;

    /**
    * 存货名称
    */
    private String stockName;

    private Integer stockLocked;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getSkuId() {
        return skuId;
    }

    public void setSkuId(Long skuId) {
        this.skuId = skuId;
    }

    public Long getWarehouseId() {
        return warehouseId;
    }

    public void setWarehouseId(Long warehouseId) {
        this.warehouseId = warehouseId;
    }

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }

    public String getStockName() {
        return stockName;
    }

    public void setStockName(String stockName) {
        this.stockName = stockName;
    }

    public Integer getStockLocked() {
        return stockLocked;
    }

    public void setStockLocked(Integer stockLocked) {
        this.stockLocked = stockLocked;
    }
}
package com.atguigu.gmall.bean;

import javax.persistence.*;
import java.io.Serializable;

@Table(name = "wms_ware_sku")
public class WmsWareSku implements Serializable {
    /**
     * 编号
     */
    @Id
    @Column(name = "id")
    @GeneratedValue(generator = "JDBC")
    private Integer id;

    /**
     * skuid
     */
    @Column(name = "sku_id")
    private Integer skuId;

    /**
     * 仓库id
     */
    @Column(name = "warehouse_id")
    private Long warehouseId;

    /**
     * 库存数
     */
    @Column(name = "stock")
    private Integer stock;

    /**
     * 存货名称
     */
    @Column(name = "stock_name")
    private String stockName;

    @Column(name = "stock_locked")
    private Integer stockLocked;

    /**
     * 获取编号
     *
     * @return id - 编号
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置编号
     *
     * @param id 编号
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取skuid
     *
     * @return sku_id - skuid
     */
    public Integer getSkuId() {
        return skuId;
    }

    /**
     * 设置skuid
     *
     * @param skuId skuid
     */
    public void setSkuId(Integer skuId) {
        this.skuId = skuId;
    }

    /**
     * 获取仓库id
     *
     * @return warehouse_id - 仓库id
     */
    public Long getWarehouseId() {
        return warehouseId;
    }

    /**
     * 设置仓库id
     *
     * @param warehouseId 仓库id
     */
    public void setWarehouseId(Long warehouseId) {
        this.warehouseId = warehouseId;
    }

    /**
     * 获取库存数
     *
     * @return stock - 库存数
     */
    public Integer getStock() {
        return stock;
    }

    /**
     * 设置库存数
     *
     * @param stock 库存数
     */
    public void setStock(Integer stock) {
        this.stock = stock;
    }

    /**
     * 获取存货名称
     *
     * @return stock_name - 存货名称
     */
    public String getStockName() {
        return stockName;
    }

    /**
     * 设置存货名称
     *
     * @param stockName 存货名称
     */
    public void setStockName(String stockName) {
        this.stockName = stockName;
    }

    /**
     * @return stock_locked
     */
    public Integer getStockLocked() {
        return stockLocked;
    }

    /**
     * @param stockLocked
     */
    public void setStockLocked(Integer stockLocked) {
        this.stockLocked = stockLocked;
    }
}
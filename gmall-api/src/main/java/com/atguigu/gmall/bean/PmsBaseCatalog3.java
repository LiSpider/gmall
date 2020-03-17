package com.atguigu.gmall.bean;

import javax.persistence.*;
import java.io.Serializable;

@Table(name = "pms_base_catalog3")
public class PmsBaseCatalog3 implements Serializable {
    /**
     * 编号
     */
    @Id
    @Column(name = "id")
    @GeneratedValue(generator = "JDBC")
    private Long id;

    /**
     * 三级分类名称
     */
    @Column(name = "`name`")
    private String name;

    /**
     * 二级分类编号
     */
    @Column(name = "catalog2_id")
    private Long catalog2Id;

    /**
     * 获取编号
     *
     * @return id - 编号
     */
    public Long getId() {
        return id;
    }

    /**
     * 设置编号
     *
     * @param id 编号
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 获取三级分类名称
     *
     * @return name - 三级分类名称
     */
    public String getName() {
        return name;
    }

    /**
     * 设置三级分类名称
     *
     * @param name 三级分类名称
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取二级分类编号
     *
     * @return catalog2_id - 二级分类编号
     */
    public Long getCatalog2Id() {
        return catalog2Id;
    }

    /**
     * 设置二级分类编号
     *
     * @param catalog2Id 二级分类编号
     */
    public void setCatalog2Id(Long catalog2Id) {
        this.catalog2Id = catalog2Id;
    }
}
package com.atguigu.gmall.bean;

import javax.persistence.*;
import java.io.Serializable;

@Table(name = "pms_base_catalog2")
public class PmsBaseCatalog2 implements Serializable {
    /**
     * 编号
     */
    @Id
    @Column(name = "id")
    @GeneratedValue(generator = "JDBC")
    private Integer id;

    /**
     * 二级分类名称
     */
    @Column(name = "`name`")
    private String name;

    /**
     * 一级分类编号
     */
    @Column(name = "catalog1_id")
    private Integer catalog1Id;

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
     * 获取二级分类名称
     *
     * @return name - 二级分类名称
     */
    public String getName() {
        return name;
    }

    /**
     * 设置二级分类名称
     *
     * @param name 二级分类名称
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取一级分类编号
     *
     * @return catalog1_id - 一级分类编号
     */
    public Integer getCatalog1Id() {
        return catalog1Id;
    }

    /**
     * 设置一级分类编号
     *
     * @param catalog1Id 一级分类编号
     */
    public void setCatalog1Id(Integer catalog1Id) {
        this.catalog1Id = catalog1Id;
    }
}
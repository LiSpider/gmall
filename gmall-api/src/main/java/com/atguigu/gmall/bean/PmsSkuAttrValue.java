package com.atguigu.gmall.bean;

import javax.persistence.*;
import java.io.Serializable;

@Table(name = "pms_sku_attr_value")
public class PmsSkuAttrValue implements Serializable {
    /**
     * 编号
     */
    @Id
    @Column(name = "id")
    @GeneratedValue(generator = "JDBC")
    private Integer id;

    /**
     * 属性id（冗余)
     */
    @Column(name = "attr_id")
    private Long attrId;

    /**
     * 属性值id
     */
    @Column(name = "value_id")
    private Long valueId;

    /**
     * skuid
     */
    @Column(name = "sku_id")
    private Long skuId;

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
     * 获取属性id（冗余)
     *
     * @return attr_id - 属性id（冗余)
     */
    public Long getAttrId() {
        return attrId;
    }

    /**
     * 设置属性id（冗余)
     *
     * @param attrId 属性id（冗余)
     */
    public void setAttrId(Long attrId) {
        this.attrId = attrId;
    }

    /**
     * 获取属性值id
     *
     * @return value_id - 属性值id
     */
    public Long getValueId() {
        return valueId;
    }

    /**
     * 设置属性值id
     *
     * @param valueId 属性值id
     */
    public void setValueId(Long valueId) {
        this.valueId = valueId;
    }

    /**
     * 获取skuid
     *
     * @return sku_id - skuid
     */
    public Long getSkuId() {
        return skuId;
    }

    /**
     * 设置skuid
     *
     * @param skuId skuid
     */
    public void setSkuId(Long skuId) {
        this.skuId = skuId;
    }
}
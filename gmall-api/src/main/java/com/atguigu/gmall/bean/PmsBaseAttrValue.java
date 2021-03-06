package com.atguigu.gmall.bean;

import javax.persistence.*;
import java.io.Serializable;

@Table(name = "pms_base_attr_value")
public class PmsBaseAttrValue implements Serializable {
    /**
     * 编号
     */
    @Id
    @Column(name = "id")
    @GeneratedValue(generator = "JDBC")
    private Long id;

    /**
     * 属性值名称
     */
    @Column(name = "value_name")
    private String valueName;

    /**
     * 属性id
     */
    @Column(name = "attr_id")
    private Long attrId;

    /**
     * 启用：1 停用：0 1
     */
    @Column(name = "is_enabled")
    private String isEnabled;

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
     * 获取属性值名称
     *
     * @return value_name - 属性值名称
     */
    public String getValueName() {
        return valueName;
    }

    /**
     * 设置属性值名称
     *
     * @param valueName 属性值名称
     */
    public void setValueName(String valueName) {
        this.valueName = valueName;
    }

    /**
     * 获取属性id
     *
     * @return attr_id - 属性id
     */
    public Long getAttrId() {
        return attrId;
    }

    /**
     * 设置属性id
     *
     * @param attrId 属性id
     */
    public void setAttrId(Long attrId) {
        this.attrId = attrId;
    }

    /**
     * 获取启用：1 停用：0 1
     *
     * @return is_enabled - 启用：1 停用：0 1
     */
    public String getIsEnabled() {
        return isEnabled;
    }

    /**
     * 设置启用：1 停用：0 1
     *
     * @param isEnabled 启用：1 停用：0 1
     */
    public void setIsEnabled(String isEnabled) {
        this.isEnabled = isEnabled;
    }
}
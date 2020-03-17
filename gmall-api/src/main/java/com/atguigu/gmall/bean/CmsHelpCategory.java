package com.atguigu.gmall.bean;

import javax.persistence.*;
import java.io.Serializable;

@Table(name = "cms_help_category")
public class CmsHelpCategory implements Serializable {
    @Id
    @Column(name = "id")
    @GeneratedValue(generator = "JDBC")
    private Integer id;

    @Column(name = "`name`")
    private String name;

    /**
     * 分类图标
     */
    @Column(name = "icon")
    private String icon;

    /**
     * 专题数量
     */
    @Column(name = "help_count")
    private Integer helpCount;

    @Column(name = "show_status")
    private Integer showStatus;

    @Column(name = "sort")
    private Integer sort;

    /**
     * @return id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取分类图标
     *
     * @return icon - 分类图标
     */
    public String getIcon() {
        return icon;
    }

    /**
     * 设置分类图标
     *
     * @param icon 分类图标
     */
    public void setIcon(String icon) {
        this.icon = icon;
    }

    /**
     * 获取专题数量
     *
     * @return help_count - 专题数量
     */
    public Integer getHelpCount() {
        return helpCount;
    }

    /**
     * 设置专题数量
     *
     * @param helpCount 专题数量
     */
    public void setHelpCount(Integer helpCount) {
        this.helpCount = helpCount;
    }

    /**
     * @return show_status
     */
    public Integer getShowStatus() {
        return showStatus;
    }

    /**
     * @param showStatus
     */
    public void setShowStatus(Integer showStatus) {
        this.showStatus = showStatus;
    }

    /**
     * @return sort
     */
    public Integer getSort() {
        return sort;
    }

    /**
     * @param sort
     */
    public void setSort(Integer sort) {
        this.sort = sort;
    }
}
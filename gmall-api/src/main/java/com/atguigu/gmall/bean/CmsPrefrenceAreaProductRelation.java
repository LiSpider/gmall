package com.atguigu.gmall.bean;

import javax.persistence.*;
import java.io.Serializable;

@Table(name = "cms_prefrence_area_product_relation")
public class CmsPrefrenceAreaProductRelation  implements Serializable {
    @Id
    @Column(name = "id")
    @GeneratedValue(generator = "JDBC")
    private Long id;

    @Column(name = "prefrence_area_id")
    private Long prefrenceAreaId;

    @Column(name = "product_id")
    private Long productId;

    /**
     * @return id
     */
    public Long getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * @return prefrence_area_id
     */
    public Long getPrefrenceAreaId() {
        return prefrenceAreaId;
    }

    /**
     * @param prefrenceAreaId
     */
    public void setPrefrenceAreaId(Long prefrenceAreaId) {
        this.prefrenceAreaId = prefrenceAreaId;
    }

    /**
     * @return product_id
     */
    public Long getProductId() {
        return productId;
    }

    /**
     * @param productId
     */
    public void setProductId(Long productId) {
        this.productId = productId;
    }
}
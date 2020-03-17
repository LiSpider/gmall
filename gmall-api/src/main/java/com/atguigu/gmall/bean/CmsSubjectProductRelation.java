package com.atguigu.gmall.bean;

import javax.persistence.*;
import java.io.Serializable;

@Table(name = "cms_subject_product_relation")
public class CmsSubjectProductRelation implements Serializable {
    @Id
    @Column(name = "id")
    @GeneratedValue(generator = "JDBC")
    private Long id;

    @Column(name = "subject_id")
    private Long subjectId;

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
     * @return subject_id
     */
    public Long getSubjectId() {
        return subjectId;
    }

    /**
     * @param subjectId
     */
    public void setSubjectId(Long subjectId) {
        this.subjectId = subjectId;
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
package com.atguigu.gmall.bean;

import javax.persistence.*;
import java.io.Serializable;

@Table(name = "wms_ware_info")
public class WmsWareInfo implements Serializable {
    @Id
    @Column(name = "id")
    @GeneratedValue(generator = "JDBC")
    private Long id;

    @Column(name = "`name`")
    private String name;

    @Column(name = "address")
    private String address;

    @Column(name = "areacode")
    private String areacode;

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
     * @return address
     */
    public String getAddress() {
        return address;
    }

    /**
     * @param address
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * @return areacode
     */
    public String getAreacode() {
        return areacode;
    }

    /**
     * @param areacode
     */
    public void setAreacode(String areacode) {
        this.areacode = areacode;
    }
}
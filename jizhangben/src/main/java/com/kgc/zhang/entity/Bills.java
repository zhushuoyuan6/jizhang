package com.kgc.zhang.entity;

import java.util.Date;

public class Bills {
    private Integer id;

    private String title;

    private Date billTime;

    private Integer typeId;

    private Integer price;

    private String explaine;

    /**/
    private  String name;
/**/

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public Date getBillTime() {
        return billTime;
    }

    public void setBillTime(Date billTime) {
        this.billTime = billTime;
    }

    public Integer getTypeId() {
        return typeId;
    }

    public void setTypeId(Integer typeId) {
        this.typeId = typeId;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public String getExplaine() {
        return explaine;
    }

    public void setExplaine(String explaine) {
        this.explaine = explaine == null ? null : explaine.trim();
    }
}
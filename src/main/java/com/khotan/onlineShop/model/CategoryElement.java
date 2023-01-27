package com.khotan.onlineShop.model;

import javax.persistence.*;

@javax.persistence.Entity
@Table(name = "t_categoryelement")
public class CategoryElement extends Entity {

    @Column(name = "c_value")
    private String value;
    @Column(name = "c_code")
    private String code;
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "c_category")
    private Category category;

    public CategoryElement(String value, String code, Category category) {
        this.value = value;
        this.code = code;
        this.category = category;
    }

    public CategoryElement() {
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }
}

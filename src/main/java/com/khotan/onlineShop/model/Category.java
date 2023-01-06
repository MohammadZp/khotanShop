package com.khotan.onlineShop.model;

import javax.persistence.*;
import java.util.List;

@javax.persistence.Entity
@Table(name = "t_CategoryElement")
public class Category extends Entity {

    @Column(name = "c_name")
    private String name;
    @OneToMany(fetch = FetchType.EAGER)
    @JoinColumn(name = "c_category")
    private List<CategoryElement> possibleValues;


    public Category(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<CategoryElement> getPossibleValues() {
        return possibleValues;
    }

    public void setPossibleValues(List<CategoryElement> possibleValues) {
        this.possibleValues = possibleValues;
    }
}

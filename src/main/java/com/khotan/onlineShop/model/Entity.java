package com.khotan.onlineShop.model;

import javax.persistence.*;

@MappedSuperclass
public class Entity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id",nullable = false,unique = true,updatable = false)
    private long id;

    @Column(name="c_version")
    private int version;

    @Column(name="c_active")
    private int active;

    @Column(name="c_enable")
    private int enable;

    @Column(name="c_creationDate")
    private String creationDate;

    @Column(name="c_creationTime")
    private String creationTime;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getVersion() {
        return version;
    }

    public void setVersion(int version) {
        this.version = version;
    }

    public int getActive() {
        return active;
    }

    public void setActive(int active) {
        this.active = active;
    }

    public int getEnable() {
        return enable;
    }

    public void setEnable(int enable) {
        this.enable = enable;
    }

    public String getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(String creationDate) {
        this.creationDate = creationDate;
    }

    public String getCreationTime() {
        return creationTime;
    }

    public void setCreationTime(String creationTime) {
        this.creationTime = creationTime;
    }
}

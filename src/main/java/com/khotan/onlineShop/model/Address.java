package com.khotan.onlineShop.model;

import javax.persistence.Table;

@javax.persistence.Entity
@Table(name="t_Address")
public class Address extends Entity{
    private String cityName;
    private String state;
    private String locationLink;
    private String region;

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getLocationLink() {
        return locationLink;
    }

    public void setLocationLink(String locationLink) {
        this.locationLink = locationLink;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }
}

package com.khotan.onlineShop.model;


import javax.persistence.*;

@javax.persistence.Entity
@Table(name="t_user")
public class User extends Entity {

    @Column(name="c_firstName")
    private String firstName;

    @Column(name="c_lastName")
    private String lastName;

    @Column(name="c_age")
    private Integer age;

    @Column(name="c_username")
    private String username;

    @Column(name="c_password")
    private String password;

    @ManyToOne
    @JoinColumn(name="c_userType")
    private CategoryElement userType;

    @Column(name="c_customerNumber")
    private String customerNumber;

    @OneToOne
    @JoinColumn(name="c_address")
    private Address address;

    @Column(name="c_email")
    private String email;

    @Column(name="c_phoneNumber")
    private String phoneNumber;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public CategoryElement getUserType() {
        return userType;
    }

    public void setUserType(CategoryElement userType) {
        this.userType = userType;
    }

    public String getCustomerNumber() {
        return customerNumber;
    }

    public void setCustomerNumber(String customerNumber) {
        this.customerNumber = customerNumber;
    }
}

package com.datn.shopsale.models;

public class Address {
    private String _id;
    private String userId;
    private String name;
    private String city;
    private String street;
    private String phone_number;
    private String date;


    public Address() {
    }

    public Address(String _id, String userId,String name, String city, String street, String phone_number) {
        this._id = _id;
        this.userId = userId;
        this.name = name;
        this.city = city;
        this.street = street;
        this.phone_number = phone_number;
    }

    public String get_id() {
        return _id;
    }

    public void set_id(String _id) {
        this._id = _id;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getPhone_number() {
        return phone_number;
    }

    public void setPhone_number(String phone_number) {
        this.phone_number = phone_number;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}

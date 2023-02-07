package com.geekster.userapp.model;

public class User {
    private int id;
    private String name;
    private String username;
    private  String address;
    private long phoneNumber;

    public User(int id, String name, String username, String address, long phoneNumber) {
        this.id = id;
        this.name = name;
        this.username = username;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "User{" +
                "userId=" + id +
                ", Name='" + name + '\'' +
                ", User Name='" + username + '\'' +
                ", Address='" + address + '\'' +
                ", Phone Number=" + phoneNumber +
                '}';
    }
}

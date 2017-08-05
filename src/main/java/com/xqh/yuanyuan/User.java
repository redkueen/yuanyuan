package com.xqh.yuanyuan;

public class User {
    int id;
    String username;
    String telephone;
    String sex;
    String address;

    public User(int id, String username, String telephone,String sex, String address){
        this.id = id;
        this.username = username;
        this.telephone = telephone;
        this.address = address;
        this.sex = sex;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}

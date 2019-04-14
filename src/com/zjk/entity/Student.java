package com.zjk.entity;

public class Student {
    private String num;
    private String sex;
    private String email;
    private String name;
    private String address;
    private int id;
    private String phone;


    public Student() {
    }

    public Student(String num, String sex, String email, String name, String address, String phone) {
        this.num = num;
        this.sex = sex;
        this.email = email;
        this.name = name;
        this.address = address;
        this.phone = phone;
    }

    public Student(String num, String sex, String email, String name, String address, int id, String phone) {
        this.num = num;
        this.sex = sex;
        this.email = email;
        this.name = name;
        this.address = address;
        this.id = id;
        this.phone = phone;
    }

    public void setNum(String num) {
        this.num = num;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getNum() {
        return num;
    }

    public String getSex() {
        return sex;
    }

    public String getEmail() {
        return email;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public int getId() {
        return id;
    }

    public String getPhone() {
        return phone;
    }



}

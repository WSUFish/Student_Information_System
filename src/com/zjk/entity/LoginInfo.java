package com.zjk.entity;

public class LoginInfo {
    public boolean succeed;

    public LoginInfo(boolean succeed) {
        this.succeed = succeed;
    }

    public  LoginInfo(){

    }

    public boolean isSucceed() {
        return succeed;
    }

    public void setSucceed(boolean succeed) {
        this.succeed = succeed;
    }
}

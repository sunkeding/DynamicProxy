package com.sunkeding.proxy;

public class LoginImpl implements ILogin {
    @Override
    public void login() {
        System.out.println("调用登录方法");
    }
}

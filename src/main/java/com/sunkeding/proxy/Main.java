package com.sunkeding.proxy;

import java.lang.reflect.Proxy;

public class Main {

    public static void main(String[] args) {
        LoginImpl imp=new LoginImpl();
        ILogin iLogin= (ILogin) Proxy.newProxyInstance(imp.getClass().getClassLoader(),imp.getClass().getInterfaces(),new ProxyHandler(imp));
        iLogin.login();

    }
}

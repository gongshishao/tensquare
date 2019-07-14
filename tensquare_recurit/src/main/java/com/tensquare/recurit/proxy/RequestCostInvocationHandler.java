package com.tensquare.recurit.proxy;

import com.tensquare.recurit.proxy.impl.ProductServiceImpl;
import com.tensquare.recurit.proxy.impl.UserServiceImpl;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class RequestCostInvocationHandler implements InvocationHandler {
    private Object target;

    public Object getTarget() {
        return target;
    }

    public void setTarget(Object target) {
        this.target = target;
    }

    private RequestCostInvocationHandler(Object target) {
        this.target = target;
    }
    /** 被代理对象的任何方法被执行时，都会先进入这个方法 */
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        if (method.getName().equals("request")) {
            long startTime = System.currentTimeMillis();
            // 执行目标对象的方法
            Object invoke = method.invoke(target, args);
            System.out.println("request cost :" + (System.currentTimeMillis() - startTime));
            System.out.printf("invoke: %s", invoke);
            System.out.println();
        }
        return null;
    }
    public static void main(String[] args) {
        // 3个参数解释如下
        // classloader,生成代理类
        // 代理类应该实现的接口
        // 实现InvocationHandler的切面类
        IUserService userService = (IUserService) Proxy.newProxyInstance(IUserService.class.getClassLoader(),
                new Class[]{IUserService.class}, new RequestCostInvocationHandler(new UserServiceImpl()));
        IProductService productService = (IProductService) Proxy.newProxyInstance(IProductService.class.getClassLoader(),
                new Class[]{IProductService.class}, new RequestCostInvocationHandler(new ProductServiceImpl()));
        // this is userService
        // reques cost :0
        userService.request();
        // this is productService
        // reques cost :0
        productService.request();
    }
}


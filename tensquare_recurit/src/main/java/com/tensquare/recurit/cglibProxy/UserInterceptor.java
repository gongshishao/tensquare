package com.tensquare.recurit.cglibProxy;

import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.invoke.MethodHandleInfo;
import java.lang.reflect.Method;

/**
 * @author Fredy
 * @version 1.0
 * @description com.tensquare.recurit.cglibProxy
 * @date 2019/7/10
 */

public class UserInterceptor implements MethodInterceptor {

    @Override
    public Object intercept(Object obj, Method method, Object[] args, MethodProxy proxy) throws Throwable {
        System.out.println("预处理");
        Object object =  proxy.invokeSuper(obj,args);
        System.out.println("后处理");
        return object;
    }
}

package com.tensquare.recurit.proxy.impl;

import com.tensquare.recurit.proxy.IProductService;

/**
 * @author Fredy
 * @version 1.0
 * @description proxy
 * @date 2019/7/9
 */

public class ProductServiceImpl implements IProductService {

    @Override
    public String request() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("模拟产品服务响应时间");
        return "响应成功：200";
    }
}

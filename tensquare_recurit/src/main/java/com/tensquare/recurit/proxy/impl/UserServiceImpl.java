package com.tensquare.recurit.proxy.impl;

import com.tensquare.recurit.proxy.IUserService;
import org.springframework.stereotype.Service;

/**
 * @author Fredy
 * @version 1.0
 * @description proxy
 * @date 2019/7/9
 */
@Service
public class UserServiceImpl implements IUserService {

    @Override
    public String request() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("模拟用户服务响应时间");
        return "响应成功：200";
    }
}

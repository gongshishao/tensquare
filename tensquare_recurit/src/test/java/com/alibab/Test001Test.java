package com.alibab;

import com.tensquare.recurit.RecruitApplication;
import com.tensquare.recurit.cglibProxy.UserInterceptor;
import com.tensquare.recurit.cglibProxy.UserServiceImpl;
import com.tensquare.recurit.proxy.IUserService;
import net.sf.cglib.proxy.Enhancer;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.*;

/**
 * @author Fredy
 * @version 1.0
 * @description com.alibab
 * @date 2019/7/10
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = RecruitApplication.class)
public class Test001Test {

    @Autowired
    private IUserService userService;

    @Before
    public void setUp() throws Exception {
        System.out.println("開始測試");
    }

    @After
    public void tearDown() throws Exception {
        System.out.println("結束测试");
    }

    @Test
    public void testJDKProxy() {
        userService.request();
    }

    @Test
    public void testCglibProxy() {
        Enhancer enchancer = new Enhancer();//字节码增强器
        enchancer.setSuperclass(UserServiceImpl.class);//设置被代理类为父类
        enchancer.setCallback(new UserInterceptor());//设置回调
        UserServiceImpl user = (UserServiceImpl)enchancer.create();//创建代理实例
        user.eat("葡萄");
    }
}
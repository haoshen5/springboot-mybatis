package com.atguigu.web.listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

@WebListener  //相当于在web.xml文件中声明监听器配置
public class HelloListener implements ServletContextListener {
    @Override
    public void contextDestroyed(ServletContextEvent arg0) {
        System.out.println("应用销毁了....HelloListener");
    }

    @Override
    public void contextInitialized(ServletContextEvent arg0) {
        System.out.println("应用启动了....HelloListener");
    }
}

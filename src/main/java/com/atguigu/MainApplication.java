package com.atguigu;


import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@ServletComponentScan  //扫描@WebListener  @WebFillter  @WebServlet
@EnableScheduling  //启动任务调度  Spring底层集成Quartz组件
@EnableTransactionManagement  //开启声明式事务
//@ComponentScan("com.atguigu")  // 不推荐，框架默认扫描main程序所在的包以及子包.
@MapperScan("com.atguigu.dao")  //生成dao的代理对象,将dao代理对象交给Spring IOC容器进行管理
@SpringBootApplication
public class MainApplication {
    public static void main(String[] args) {
        SpringApplication.run(MainApplication.class,args);
    }
}

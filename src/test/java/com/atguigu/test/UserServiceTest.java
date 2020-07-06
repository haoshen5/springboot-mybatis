package com.atguigu.test;


import com.atguigu.domain.User;
import com.atguigu.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserServiceTest {

    @Autowired
    UserService userService;

    @Autowired
    DataSource dataSource;

    @Test
    public void  testDataSource() throws SQLException {
        // com.zaxxer.hikari.HikariDataSource       默认数据源：性能高
        // com.alibaba.druid.pool.DruidDataSource   阿里数据源：稳定性好
        System.out.println(dataSource.getClass());

        Connection conn = dataSource.getConnection();
        System.out.println("conn = " + conn);
        conn.close();  //归还连接池

    }


    @Test
    public void testFindAll(){
        List<User> list = userService.findAll();
        for (User user : list) {
            System.out.println("user = " + user);
        }
    }

}

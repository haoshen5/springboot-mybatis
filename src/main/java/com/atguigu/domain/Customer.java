package com.atguigu.domain;

import javax.persistence.*;
import java.io.Serializable;


/**
 *实体类是用来表示数据的，往往需要进行序列化，所以，推荐实现Serializable接口
 * JPA：Java Persistence API 是一套持久化规范
 * ORM：Object - Relationship - Mapping
 *      JavaBean 与 表 进行映射
 */
@Entity
@Table(name = "customer")
public class Customer implements Serializable {

    // 主键
    @Id  //声明主键
    @GeneratedValue(strategy = GenerationType.IDENTITY)  //声明主键的生成方式
    private Integer id;

    // 用户名
    //@Column(name = "username") 字段名称与类的属性名称一致，可以省略不写
    private String username;
    // 密码
    private String password;
    // 姓名
    private String name;
    //年龄
    private Integer age;

    public Customer() {
    }

    public Customer(String username, String password, String name, Integer age) {
        this.username = username;
        this.password = password;
        this.name = name;
        this.age = age;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

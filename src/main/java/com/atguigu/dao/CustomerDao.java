package com.atguigu.dao;

import com.atguigu.domain.Customer;
import org.springframework.data.jpa.repository.JpaRepository;


/**
 * 继承JPA规范接口，接口中已经提供好了常用的CRUD方法
 */
public interface CustomerDao extends JpaRepository<Customer,Integer> {
}

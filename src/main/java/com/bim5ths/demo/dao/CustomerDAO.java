package com.bim5ths.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.bim5ths.demo.entity.Customer;
@Repository
public interface CustomerDAO extends JpaRepository<Customer, Integer> {

}

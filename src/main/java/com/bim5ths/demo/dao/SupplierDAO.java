package com.bim5ths.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bim5ths.demo.entity.Supplier;
public interface SupplierDAO extends JpaRepository<Supplier, Integer> {

}

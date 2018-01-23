package com.bim5ths.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bim5ths.demo.dao.SupplierDAO;
import com.bim5ths.demo.entity.Supplier;

@Service
public class SupplierServiceImpl implements SupplierService{
	@Autowired
	SupplierDAO supplierDAO;

	@Override
	public List<Supplier> allSupplier() {		
		return supplierDAO.findAll();
	}

	@Override
	public Supplier oneSupplier(int id) {		
		return supplierDAO.findOne(id);
	}

	@Override
	public Supplier createSupplier(Supplier supplier) {		
		return supplierDAO.save(supplier);
	}

}

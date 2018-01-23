package com.bim5ths.demo.service;

import java.util.List;

import com.bim5ths.demo.entity.Supplier;

public interface SupplierService {
	List<Supplier> allSupplier(); 
	Supplier oneSupplier(int id);
	Supplier createSupplier(Supplier supplier);
	

}

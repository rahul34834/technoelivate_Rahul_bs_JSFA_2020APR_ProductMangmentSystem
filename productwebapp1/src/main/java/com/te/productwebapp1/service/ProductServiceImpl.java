package com.te.productwebapp1.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.te.productwebapp1.beans.Admin;
import com.te.productwebapp1.beans.Products;
import com.te.productwebapp1.dao.ProductDAO;

@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	ProductDAO dao;

	@Override
	public Admin authenticate(int id, String pwd) {
		if (id <= 0) {
			return null;
		} else {
			return dao.authenticate(id, pwd);
		}

	}

	@Override
	public Products getProductData(int id) {
		if (id <= 0) {
			return null;
		}
		return dao.getProductData(id);
	}

	@Override
	public boolean deleteProductData(int id) {

		return dao.deleteProductData(id);
	}

	@Override
	public boolean addProduct(Products product) {
		return dao.addProduct(product);
	}

	@Override
	public boolean updateRecord(Products product) {
		// TODO Auto-generated method stub
		return dao.updateRecord(product);
	}

	@Override
	public List<Products> getAllProduct() {

		return dao.getAllProduct();
	}

	

}

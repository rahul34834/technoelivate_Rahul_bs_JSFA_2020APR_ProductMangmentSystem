package com.te.productwebapp1.service;

import java.util.List;

import com.te.productwebapp1.beans.Admin;
import com.te.productwebapp1.beans.Products;

public interface ProductService {

	public Admin authenticate(int id, String pwd);

	public Products getProductData(int id);

	public boolean deleteProductData(int id);

	public boolean addProduct(Products product);

	public boolean updateRecord(Products product);

	public List<Products> getAllProduct();
}

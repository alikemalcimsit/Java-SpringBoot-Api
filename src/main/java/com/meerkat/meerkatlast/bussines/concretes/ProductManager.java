package com.meerkat.meerkatlast.bussines.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.meerkat.meerkatlast.bussines.abstracts.ProductService;
import com.meerkat.meerkatlast.dataAccess.abstracts.ProductDao;
import com.meerkat.meerkatlast.entities.concretes.Product;
@Service
public class ProductManager implements ProductService   {

	private ProductDao productDao;
	@Autowired
	public ProductManager(ProductDao productDao) {
		super();
		this.productDao = productDao;
	}

	@Override
	public List<Product> getAll() {
		// TODO Auto-generated method stub
		return this.productDao.findAll();
	}

}

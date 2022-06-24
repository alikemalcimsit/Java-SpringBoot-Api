package com.meerkat.meerkatlast.api.controllers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
import com.meerkat.meerkatlast.bussines.abstracts.ProductService;
import com.meerkat.meerkatlast.entities.concretes.Product;

@RestController
@RequestMapping("/api/products")
public class ProductsController {
	
	private ProductService productService;
	@Autowired
	public ProductsController(ProductService productService) {
		super();
		this.productService = productService;
	}

	@GetMapping("/getall")
	public List<Product> getAll(){
		return this.productService.getAll();
	}
}

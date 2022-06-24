package com.meerkat.meerkatlast.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import com.meerkat.meerkatlast.entities.concretes.Product;

public interface ProductDao extends JpaRepository<Product,Integer>{

}

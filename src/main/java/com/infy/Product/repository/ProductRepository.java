package com.infy.Product.repository;



import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.infy.Product.entity.Product;


public interface ProductRepository extends JpaRepository<Product, Integer>{
	List<Product> findByCategory(String category);
	List<Product> findByProductname(String productname);
	//List<Product> findByProductId(Integer prodid);
}

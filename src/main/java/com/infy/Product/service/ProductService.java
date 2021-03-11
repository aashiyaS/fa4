package com.infy.Product.service;



import java.util.List;

import com.infy.Product.Dto.ProductDTO;







public interface ProductService {
	public List<ProductDTO> getAllProducts() throws ProductMSException;
	public List<ProductDTO> getProductByCategory(String category)throws ProductMSException;
	
	public List<ProductDTO> getProductByName(String productname) throws ProductMSException;
	public void   addProduct(int sellerid,ProductDTO productdto) throws ProductMSException;
		// TODO Auto-generated method stub
		
	
	
}

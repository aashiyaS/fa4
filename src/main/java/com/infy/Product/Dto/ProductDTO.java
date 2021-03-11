package com.infy.Product.Dto;

import com.infy.Product.entity.Product;

public class ProductDTO {
	int prodid;
	String brand;
	String category;
	String description;
	String image;
	String productname;
	String subcategory;
	int sellerid;
	int stock;
	float price;
	Integer rating;
	public ProductDTO()
	{
	super();	
	}
	public ProductDTO(int prodid,String brand,String description,String image,String productname,String subcategory,int sellerid,int stock,long price,int rating)
	{
		this();
		this.prodid=prodid;
		this.brand=brand;
		this.description=description;
		this.image=image;
		this.productname=productname;
		this.subcategory=subcategory;
		this.sellerid=sellerid;
		this.stock=stock;
		this.price=price;
		this.rating=rating;
	}
	
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public String getProductname() {
		return productname;
	}
	public void setProductname(String productname) {
		this.productname = productname;
	}
	public String getSubcategory() {
		return subcategory;
	}
	public void setSubcategory(String subcategory) {
		this.subcategory = subcategory;
	}
	public int getSellerid() {
		return sellerid;
	}
	public void setSellerid(int sellerid) {
		this.sellerid = sellerid;
	}
	public int getStock() {
		return stock;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}
	
	
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	
	public Integer getRating() {
		return rating;
	}
	public void setRating(Integer rating) {
		this.rating = rating;
	}
	
	public static ProductDTO valueOf(Product product)
	{
	ProductDTO prodDTO = new ProductDTO();
	prodDTO.setBrand(product.getBrand());
	prodDTO.setCategory(product.getCategory());
	prodDTO.setDescription(product.getDescription());
	prodDTO.setImage(product.getImage());
	prodDTO.setPrice(product.getPrice());
	prodDTO.setProdid(product.getProdid());
	prodDTO.setProductname(product.getProductname());
	prodDTO.setRating(product.getRating());
	prodDTO.setSellerid(product.getSellerid());
	prodDTO.setSubcategory(product.getSubcategory());
	prodDTO.setStock(product.getStock());
	return prodDTO;
	
}
	public int getProdid() {
		return prodid;
	}
	public void setProdid(int prodid) {
		this.prodid = prodid;
	}
	public Product createEntity() {
		Product pp=new Product();
		pp.setBrand(this.getBrand());
		pp.setCategory(this.getCategory());
		pp.setDescription(this.getDescription());
		pp.setImage(this.getImage());
		pp.setPrice(this.getPrice());
		pp.setProdid(this.getProdid());
		pp.setProductname(this.getProductname());
		pp.setRating(this.getRating());
		pp.setSellerid(this.getSellerid());
		pp.setStock(this.getStock());
		pp.setSubcategory(this.getSubcategory());
		return pp;
	}
}

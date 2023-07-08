package com.Product.springboot.Entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Productdetails {

	
	public String getProductname() {
		return productname;
	}
	public void setProductname(String productname) {
		this.productname = productname;
	}
	public String getProductcategory() {
		return productcategory;
	}
	public void setProductcategory(String productcategory) {
		this.productcategory = productcategory;
	}
	public String getProductprice() {
		return productprice;
	}
	public void setProductprice(String productprice) {
		this.productprice = productprice;
	}
	public int getProductid() {
		return productid;
	}
	public void setProductid(int productid) {
		this.productid = productid;
	}
	public String getProductdescription() {
		return productdescription;
	}
	public void setProductdescription(String productdescription) {
		this.productdescription = productdescription;
	}
	public int getProductweight() {
		return productweight;
	}
	public void setProductweight(int productweight) {
		this.productweight = productweight;
	}
	String productname;
	String productcategory;
	String productprice;
	@Id
	int productid;
	String productdescription;
	int productweight;
}

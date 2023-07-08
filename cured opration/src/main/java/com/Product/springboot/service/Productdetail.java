package com.Product.springboot.service;

import com.Product.springboot.Entity.Productdetails;
import com.Product.springboot.reposotary.Productdetailsrepo;

public interface Productdetail {

	public Productdetails getproductdetails (int id);
	public void deletproductdetails(int id);
	public void saveproduct(Productdetails pro);
	public void updatePrice(int id, String price);
}

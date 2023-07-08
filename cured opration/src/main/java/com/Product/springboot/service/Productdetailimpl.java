package com.Product.springboot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Product.springboot.Entity.Productdetails;
import com.Product.springboot.reposotary.Productdetailsrepo;



@Service
public   class Productdetailimpl implements Productdetail  {
	
	@Autowired
	Productdetailsrepo products;

	@Override
	public Productdetails getproductdetails(int id) {
		// TODO Auto-generated method stub
		return products.findById(id).get();
	}

	@Override
	public void saveproduct(Productdetails pro) {
		// TODO Auto-generated method stub
		products.save(pro);
	}

	@Override
	public void deletproductdetails(int id) {
		// TODO Auto-generated method stub
		products.deleteById(id);
	}

	@Override
	public void updatePrice(int id, String price) {
		// TODO Auto-generated method stub
		Productdetails proo =products.findById(id).get();
		proo.setProductprice(price);
		products.save(proo);
		
	}




	

	

}

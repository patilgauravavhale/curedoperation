package com.Product.springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.Product.springboot.Entity.Productdetails;
import com.Product.springboot.service.Productdetail;



@RestController
public class Productcontroller {
	
	@Autowired
	Productdetail proservice;
	
	@GetMapping("product")
	public Productdetails getProductdetailsbyid(@RequestParam("id")int id) {
		return proservice.getproductdetails(id);
		
	}

	@PostMapping("products")
	public String saveproductdetails(@RequestBody Productdetails prodet) {
		try {
			proservice.saveproduct(prodet);
		} catch (Exception e) {
			// TODO: handle exception
			return"fail"+e.getMessage();
		}
		proservice.saveproduct(prodet);
		return "sucess";
	}  
	
	
	@PutMapping("products")
	public String Updateproductdetails(@RequestParam("productid") int id,@RequestParam("price" )String price) {
		try {
			proservice.updatePrice(id,price);
		} catch (Exception e) {
			// TODO: handle exception
			return"fail"+e.getMessage();
		}
		proservice.updatePrice(id,price);
		return "sucess";
	}
	
	
	@DeleteMapping("productss")
	public String deletProductdetailsbyid(@RequestParam("id")int id) {
		try {
			proservice.deletproductdetails(id);
		} catch (Exception e) {
			// TODO: handle exception
			return "error";
		}
		proservice.deletproductdetails(id);
		return "sucess";
	}
	
}

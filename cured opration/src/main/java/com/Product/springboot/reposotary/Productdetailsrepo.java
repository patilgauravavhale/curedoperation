package com.Product.springboot.reposotary;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Product.springboot.Entity.Productdetails;

@Repository
public interface Productdetailsrepo  extends JpaRepository<Productdetails , Integer>{

}

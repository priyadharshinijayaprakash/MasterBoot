package com.example.masterboot;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BootService {
	@Autowired
	BootRepo db;

	public List<Product> getAllProducts() {
		return db.findAll();

	}
	public Product getOneProduct(String name) {
		return db.findByName(name);

	}
	public void addOneProduct(Product p) {
		db.save(p);
		
	}

}

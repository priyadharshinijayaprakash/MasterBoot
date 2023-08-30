package com.example.masterboot;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BootController {
	@Autowired
	BootService bs;
	@GetMapping("/products")
	public List<Product> getAllProducts(){
		return bs.getAllProducts();
		}
	@GetMapping("/product/{name}")
	public Product getOneProduct(@PathVariable String name){
		return bs.getOneProduct(name);
		}
	@PostMapping("/product")
	public void postOneProduct(@RequestBody Product p) {
		bs.addOneProduct(p);
	}
	}

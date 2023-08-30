package com.example.masterboot;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Product {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int productid;
	private String name;
	private String place;
	private int age;
	public Product() {
		super();
	}
	public Product(int productid, String name, String place, int age) {
		super();
		this.productid = productid;
		this.name = name;
		this.place = place;
		this.age = age;
	}
	@Override
	public String toString() {
		return "Product [productid=" + productid + ", name=" + name + ", place=" + place + ", age=" + age + "]";
	}
	public int getProductid() {
		return productid;
	}
	public void setProductid(int productid) {
		this.productid = productid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPlace() {
		return place;
	}
	public void setPlace(String place) {
		this.place = place;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
}

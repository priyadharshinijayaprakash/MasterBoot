package com.example.masterboot;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface BootRepo extends JpaRepository<Product, Integer>{

	Product findByName(String name);

	

}

package com.trainings.springboot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.trainings.springboot.model.Product;
import com.trainings.springboot.repository.ProductRepository;

@Service
public class ProductService {
	
	@Autowired
	ProductRepository repo;

	
	public void save(Product product) {
		repo.save(product);
	}
	
	public List<Product> getProducts(){
		return repo.findAll();
	}
	
	/*public ResponseEntity<List<Employee>> getEmployeesByName (@RequestParam String empName){
		return new ResponseEntity<List<Employee>> (repo.findByEmpName(empName), HttpStatus.OK);
	}*/
	
	public Product getProduct(int id) {
		return repo.findById(id).get();
	}
	
	public void deleteProduct(int id) {
		repo.deleteById(id);
	}

}
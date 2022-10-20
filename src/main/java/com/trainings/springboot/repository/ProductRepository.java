package com.trainings.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import com.trainings.springboot.model.Product;

@Service
public interface ProductRepository extends JpaRepository<Product, Integer>{

}

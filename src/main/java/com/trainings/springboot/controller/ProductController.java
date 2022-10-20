package com.trainings.springboot.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.trainings.springboot.model.Product;
import com.trainings.springboot.service.ProductService;

@Controller
@RequestMapping("/")
public class ProductController {
	
	@Autowired
	ProductService service; // will autowire service instance
	
	@RequestMapping(method=RequestMethod.GET)
	public String sayHi() {
		return "productIndex";
	}
	
	@RequestMapping("/productIndex")
	public String hello(HttpServletRequest req) {
		return "productIndex";
	}
	@RequestMapping(value = "addItem", method = RequestMethod.POST)
	public String addItem() {
		return "addItem";
	}
	
	@RequestMapping(value = "insertDatabase", method = RequestMethod.POST)
	public String insertDatabase(HttpServletRequest req) {
		String productName = req.getParameter("pname");
	
		Product product = new Product();
		product.setProductName(productName);
	
		
		service.save(product);
		return "productIndex";
	}
	
	@RequestMapping(value = "allProducts", method = RequestMethod.POST)
	public String allProducts(ModelMap map) {
		List<Product> products = service.getProducts();
		map.addAttribute("productList", products);
		
		return "allProducts";
	}
	
	@RequestMapping(value = "deleteProduct", method = RequestMethod.POST)
	public String deleteProduct(ModelMap map) {
		List<Product> products = service.getProducts();
		map.addAttribute("productList", products);
		return "deleteProduct";
	}
	
	@RequestMapping(value = "removeFromDatabase", method = RequestMethod.POST)
	public String removeFromDatabase(HttpServletRequest req) {
		String pid = req.getParameter("pid");
		
		int productId = Integer.parseInt(pid);
		
		service.deleteProduct(productId);
		return "productIndex";
	}
	
	@RequestMapping(value = "searchProduct", method = RequestMethod.POST)
	public String searchProduct() {
		return "searchProduct";
	}
	
	@RequestMapping(value = "searchDatabase", method = RequestMethod.POST)
	public String searchDatabase(ModelMap map, HttpServletRequest req) {
		String pid = req.getParameter("pid");
		
		int productId = Integer.parseInt(pid);
		
		Product product = service.getProduct(productId);
		
		map.addAttribute("product", product);
		
		return "searchProduct";
	}
}
package br.com.cache.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.cache.entity.Product;
import br.com.cache.repository.ProductDao;

@RestController
@RequestMapping("/product")
public class CacheController {

	@Autowired
	private ProductDao productDao;

	@PostMapping
	public Product save(@RequestBody Product product) {
		try {
			product = productDao.save(product);
			return product;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}
	

	@GetMapping
	public List<Product> getAllProducts() {
		return productDao.findAll();
	}

	@GetMapping("/{id}")
	public Product getProduct(@PathVariable int id) {
		return productDao.findProductById(id);
	}

	@DeleteMapping("/{id}")
	public String remove(@PathVariable int id) {
		return productDao.deleteProduct(id);
	}
	
}

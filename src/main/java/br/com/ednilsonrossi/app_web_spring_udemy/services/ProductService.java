package br.com.ednilsonrossi.app_web_spring_udemy.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.ednilsonrossi.app_web_spring_udemy.model.Product;
import br.com.ednilsonrossi.app_web_spring_udemy.repositories.ProductRepository;

@Service
public class ProductService {

	@Autowired
	private ProductRepository repository;
	
	public List<Product> findAll(){
		return repository.findAll();
	}
	
	public Product findById(Long id) {
		Optional<Product> o = repository.findById(id);
		return o.get();
	}
}

package br.com.ednilsonrossi.app_web_spring_udemy.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.ednilsonrossi.app_web_spring_udemy.model.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}

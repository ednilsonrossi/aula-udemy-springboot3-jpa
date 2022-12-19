package br.com.ednilsonrossi.app_web_spring_udemy.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.ednilsonrossi.app_web_spring_udemy.model.Order;
import br.com.ednilsonrossi.app_web_spring_udemy.model.User;
import br.com.ednilsonrossi.app_web_spring_udemy.repositories.OrderRepository;
import br.com.ednilsonrossi.app_web_spring_udemy.services.exceptions.ResourceNotFoundException;


@Service
public class OrderService {

	@Autowired
	private OrderRepository orderRepository;
	
	public List<Order> findAll(){
		return orderRepository.findAll();
	}
	
	public Order findById(Long id) {
		Optional<Order> optional = orderRepository.findById(id);
		return optional.orElseThrow(() -> new ResourceNotFoundException(id) );
	}
}

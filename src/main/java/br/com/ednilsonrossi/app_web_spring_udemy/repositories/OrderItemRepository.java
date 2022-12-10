package br.com.ednilsonrossi.app_web_spring_udemy.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.ednilsonrossi.app_web_spring_udemy.model.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{

}

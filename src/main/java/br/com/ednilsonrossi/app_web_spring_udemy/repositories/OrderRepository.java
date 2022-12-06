package br.com.ednilsonrossi.app_web_spring_udemy.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.ednilsonrossi.app_web_spring_udemy.model.Order;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long>{

}

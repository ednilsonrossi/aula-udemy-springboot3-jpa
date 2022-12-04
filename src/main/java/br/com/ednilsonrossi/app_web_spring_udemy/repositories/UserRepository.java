package br.com.ednilsonrossi.app_web_spring_udemy.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.ednilsonrossi.app_web_spring_udemy.model.User;

public interface UserRepository extends JpaRepository<User, Long>{

}

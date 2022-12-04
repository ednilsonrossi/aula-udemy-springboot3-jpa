package br.com.ednilsonrossi.app_web_spring_udemy.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.ednilsonrossi.app_web_spring_udemy.model.User;
import br.com.ednilsonrossi.app_web_spring_udemy.repositories.UserRepository;


@Service
public class UserService {

	@Autowired
	private UserRepository userRepository;
	
	public List<User> findAll(){
		return userRepository.findAll();
	}
	
	public User findById(Long id) {
		Optional<User> optional = userRepository.findById(id);
		return optional.get();
	}
}

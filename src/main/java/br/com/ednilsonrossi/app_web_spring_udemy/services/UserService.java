package br.com.ednilsonrossi.app_web_spring_udemy.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

import br.com.ednilsonrossi.app_web_spring_udemy.model.User;
import br.com.ednilsonrossi.app_web_spring_udemy.repositories.UserRepository;
import br.com.ednilsonrossi.app_web_spring_udemy.services.exceptions.DatabaseException;
import br.com.ednilsonrossi.app_web_spring_udemy.services.exceptions.ResourceNotFoundException;


@Service
public class UserService {

	@Autowired
	private UserRepository userRepository;
	
	public List<User> findAll(){
		return userRepository.findAll();
	}
	
	public User findById(Long id) {
		Optional<User> optional = userRepository.findById(id);
		return optional.orElseThrow(() -> new ResourceNotFoundException(id) );
	}
	
	public User insert(User obj) {
		return userRepository.save(obj);
	}
	
	public void delete(Long id) {
		try {
			userRepository.deleteById(id);
		}catch (EmptyResultDataAccessException e) {
			throw new ResourceNotFoundException(id);
		}catch (DataIntegrityViolationException e) {
			throw new DatabaseException(e.getMessage());
		}
	}
	
	public User update(Long id, User user) {
		User entity = userRepository.getReferenceById(id);
		updateData(entity, user);
		return userRepository.save(entity);
	}

	private void updateData(User entity, User user) {
		
		entity.setName(user.getName());
		entity.setEmail(user.getEmail());
		entity.setPhone(user.getPhone());
		
	}
	
	
}

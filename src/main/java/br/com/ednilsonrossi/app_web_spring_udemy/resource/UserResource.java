package br.com.ednilsonrossi.app_web_spring_udemy.resource;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.ednilsonrossi.app_web_spring_udemy.model.User;

@RestController
@RequestMapping(value = "/users")
public class UserResource {

	@GetMapping
	public ResponseEntity<User> findAll(){
		User u = new User(1L, "Maria", "maria@gmail", "999991111", "12345");
		return ResponseEntity.ok().body(u);
	}
	
}

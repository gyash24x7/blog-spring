package dev.yashgupta.blog.controller;

import dev.yashgupta.blog.model.User;
import dev.yashgupta.blog.repository.UserRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

	@Autowired
	private UserRepository userRepository;

	static Logger logger = LoggerFactory.getLogger( "UserController" );

	@GetMapping( "/users" )
	public List< User > getUsers() {
		logger.info( "Getting All Users!" );
		return userRepository.getUsers();
	}

	@GetMapping( "/user/{id}" )
	public User getUser( @PathVariable int id ) {
		logger.info( "Getting user with Id: " + id );
		return userRepository.getUserById( id );
	}

}

package dev.yashgupta.blog.repository;

import dev.yashgupta.blog.exception.NotFoundException;
import dev.yashgupta.blog.model.User;
import org.springframework.stereotype.Repository;

import java.util.LinkedList;
import java.util.List;

@Repository
public class UserRepository {

	static List< User > users = new LinkedList<>();

	static {
		users.add( new User( "Virat Kohli", 1, "virat.kohli@gmail.com" ) );
		users.add( new User( "MS Dhoni", 2, "ms.dhoni@gmail.com" ) );
		users.add( new User( "Rohit Sharma", 3, "rohit.sharma@gmail.com" ) );
	}

	public List< User > getUsers() {
		return users;
	}

	public User getUserById( int id ) {
		User foundUser = users.stream().filter( user -> user.getId() == id ).findFirst().orElse( null );

		if ( foundUser == null ) {
			throw new NotFoundException( "User Not Found!" );
		}

		return foundUser;
	}

	public User getUserByEmail( String email ) {
		User foundUser = users.stream().filter( user -> user.getEmail().equals( email ) ).findFirst().orElse( null );

		if ( foundUser == null ) {
			throw new NotFoundException( "User Not Found!" );
		}

		return foundUser;
	}

	public User createUser( User user ) {
		user.setId( users.size() );
		users.add( user );
		return user;
	}
}

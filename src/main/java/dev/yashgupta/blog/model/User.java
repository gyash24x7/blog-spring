package dev.yashgupta.blog.model;

import java.util.Objects;

public class User {
	private String name;
	private int id;
	private String email;

	public User( String name, String email ) {
		this.name = name;
		this.email = email;
	}

	public User( String name, int id, String email ) {
		this.name = name;
		this.id = id;
		this.email = email;
	}

	public User() { }

	public String getName() {
		return name;
	}

	public void setName( String name ) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId( int id ) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail( String email ) {
		this.email = email;
	}

	@Override
	public boolean equals( Object o ) {
		if ( this == o ) return true;
		if ( !( o instanceof User ) ) return false;
		User user = ( User ) o;
		return Objects.equals( getId(), user.getId() ) &&
				getEmail().equals( user.getEmail() );
	}

	@Override
	public int hashCode() {
		return Objects.hash( getId(), getEmail() );
	}

	@Override
	public String toString() {
		return "User {" + "id='" + id + "'" + ", email='" + email + "'" + "}";
	}
}

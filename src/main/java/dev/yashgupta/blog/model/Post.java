package dev.yashgupta.blog.model;

import java.util.Date;
import java.util.Objects;

public class Post {
	private String title;
	private String description;
	private int id;
	private Date publishedTime;

	public Post( String title, String description, int id, Date publishedTime ) {
		this.title = title;
		this.description = description;
		this.id = id;
		this.publishedTime = publishedTime;
	}

	public Post() { }

	public String getTitle() {
		return title;
	}

	public void setTitle( String title ) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription( String description ) {
		this.description = description;
	}

	public int getId() {
		return id;
	}

	public void setId( int id ) {
		this.id = id;
	}

	public Date getPublishedTime() {
		return publishedTime;
	}

	public void setPublishedTime( Date publishedTime ) {
		this.publishedTime = publishedTime;
	}

	@Override
	public boolean equals( Object o ) {
		if ( this == o ) return true;
		if ( !( o instanceof Post ) ) return false;
		Post post = ( Post ) o;
		return getId() == post.getId();
	}

	@Override
	public int hashCode() {
		return Objects.hash( getId() );
	}

	@Override
	public String toString() {
		return "Post {" + "title='" + title + "'" + ", id=" + id + "}";
	}
}

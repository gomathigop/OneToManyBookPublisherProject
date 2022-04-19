package com.edu;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="hiberpublisher")
public class Publisher {
	
	@Id
	
private Integer publisherId;
	@Column(length = 20)
private String publisherName;
		
	@OneToMany(cascade = CascadeType.ALL)
	
	
private Set<Book> booklist;
public Integer getPublisherId() {
	return publisherId;
}
public void setPublisherId(Integer publisherId) {
	this.publisherId = publisherId;
}
public String getPublisherName() {
	return publisherName;
}
public void setPublisherName(String publisherName) {
	this.publisherName = publisherName;
}
public Set<Book> getBooklist() {
	return booklist;
}
public void setBooklist(Set<Book> booklist) {
	this.booklist = booklist;
}
@Override
public String toString() {
	return "Publisher [publisherId=" + publisherId + ", publisherName=" + publisherName + ", booklist=" + booklist
			+ "]";
}


}
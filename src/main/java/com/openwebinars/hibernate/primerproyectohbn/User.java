package com.openwebinars.hibernate.primerproyectohbn;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * 
 */

@Entity
public class User {

	@Id
	private int id;
	@Column
	private String userName;
	@Column
	private String userMessage;
	
	/**
	 * Constructor vacio
	 */
	public User() {
		//TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserMessage() {
		return userMessage;
	}

	public void setUserMessage(String userMessage) {
		this.userMessage = userMessage;
	}
	
}
package com.ctel.bpcl.security.model;

import java.io.Serializable;

/**
 *
 * @author Gowtham G
 */
public class AuthRequest implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2312393385294221996L;

	private String username;

	private String password;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	
	

}
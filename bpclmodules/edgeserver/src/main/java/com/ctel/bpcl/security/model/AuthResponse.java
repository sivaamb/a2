package com.ctel.bpcl.security.model;

import java.io.Serializable;

/**
 *
 * @author Gowtham G
 */
public class AuthResponse implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3220389809422750547L;
	private String token;

	public AuthResponse(String token) {
		super();
		this.token = token;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}
	
	

}

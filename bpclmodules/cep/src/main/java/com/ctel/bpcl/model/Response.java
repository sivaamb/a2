package com.ctel.bpcl.model;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Map;

import org.springframework.http.ResponseEntity;

/**
 * 
 * @author Gowtham
 * Global response entity
 */
public class Response implements Serializable {

	 

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 4459104759870490398L;

	private int status=200;

	private String message="success";

	private Timestamp timeStamp=new Timestamp(System.currentTimeMillis());

	private ResponseEntity<?> payload;

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Timestamp getTimeStamp() {
		return timeStamp;
	}

	public void setTimeStamp(Timestamp timeStamp) {
		this.timeStamp = timeStamp;
	}

	public ResponseEntity<?> getPayload() {
		return payload;
	}

	public void setPayload(ResponseEntity<?> payload) {
		this.payload = payload;
	}

	public Response(int status, String message,  ResponseEntity<?> payload) {
		super();
		this.status = status;
		this.message = message;
		this.payload = payload;
	}

	public Response(int status, Map<String, Object> errorAttributes) {
		this.status = status;
		this.payload=(ResponseEntity<?>) errorAttributes;
	}

}

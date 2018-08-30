package net.yahia.yahibroshopping.exception;

import java.io.Serializable;

public class ProductNotFounfException extends Exception implements Serializable {
   
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String message;
	
	public ProductNotFounfException() {
		this("Product is not available");
	}
	
	public ProductNotFounfException(String message) {
		this.message = System.currentTimeMillis() + ": " + message;
	}

	public String getMessage() {
		return message;
	}

	
}

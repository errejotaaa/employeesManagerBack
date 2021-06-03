package com.example.employeeManager.exception;

public class UserNotFoundException extends RuntimeException {


	/**
	 * 
	 */
	private static final long serialVersionUID = 6357135049316802L;

	public UserNotFoundException(String message) {
		super(message);
	}
}

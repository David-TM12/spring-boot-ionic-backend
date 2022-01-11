package com.davidmagalhaes.cursomc.services.exceptions;

public class AuthorizationException extends RuntimeException{
	
	private static final long serialVersionUID = 1L;

	public AuthorizationException(String msg) {
		super(msg);
	}
	
	public AuthorizationException(String msg, Throwable causes) {
		super(msg, causes);
	}
	
}

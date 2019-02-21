package com.exam.core.exception;

/**
 * @author thein
 * @createdAt Feb 19, 2019
 */
public class BusinessException extends Exception {

	private static final long serialVersionUID = -8022340694239590378L;

	public BusinessException() {
		super();
	}

	public BusinessException(final String message) {
		super(message);
	}

	public BusinessException(final String message, final Throwable cause) {
		super(message, cause);
		cause.printStackTrace();
	}

	public BusinessException(final Throwable cause) {
		super(cause);
		cause.printStackTrace();
	}
}

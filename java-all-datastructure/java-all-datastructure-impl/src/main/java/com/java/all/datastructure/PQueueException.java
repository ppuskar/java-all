package com.java.all.datastructure;


/**
 * Exception class for {@link PQueue}.
 * 
 * @author Praveen.Puskar
 *
 */
public class PQueueException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4799634122212582946L;

	/**
	 * 
	 */
	public PQueueException() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param message
	 * @param cause
	 * @param enableSuppression
	 * @param writableStackTrace
	 */
	public PQueueException(String message, Throwable cause,
			boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param message
	 * @param cause
	 */
	public PQueueException(String message, Throwable cause) {
		super(message, cause);
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param message
	 */
	public PQueueException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param cause
	 */
	public PQueueException(Throwable cause) {
		super(cause);
		// TODO Auto-generated constructor stub
	}

}

package br.com.rudson.carvalho.service.exception;

/**
 * @author rudsonkiyoshi
 *
 */
public class ServiceException extends Exception {
	
	private static final long serialVersionUID = 1L;

	/**
	 * @param message
	 * @param e
	 */
	public ServiceException(String message, Throwable e) {
		super(message, e);
	}
	
}

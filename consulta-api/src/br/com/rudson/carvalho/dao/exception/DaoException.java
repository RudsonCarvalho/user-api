package br.com.rudson.carvalho.dao.exception;

/**
 * @author rudsonkiyoshi
 *
 */
public class DaoException extends Exception {
	
	private static final long serialVersionUID = 1L;

	/**
	 * @param message
	 * @param e
	 */
	public DaoException(String message, Throwable e) {
		super(message, e);
	}
	
}
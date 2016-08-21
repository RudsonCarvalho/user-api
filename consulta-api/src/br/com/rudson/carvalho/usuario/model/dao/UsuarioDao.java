package br.com.rudson.carvalho.usuario.model.dao;

import br.com.rudson.carvalho.dao.exception.DaoException;
import br.com.rudson.carvalho.usuario.model.User;

/**
 * @author rudsonkiyoshi
 *
 */
public interface UsuarioDao {
	
	/**
	 * Metodo responsavel por carregar o usuario do banco de dados
	 * @param id
	 * @return
	 * @throws DaoException
	 */
	User loadUser(Long id) throws DaoException;	
}

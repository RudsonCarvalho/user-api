package br.com.rudson.carvalho.usuario.service;

import br.com.rudson.carvalho.service.exception.ServiceException;
import br.com.rudson.carvalho.usuario.model.User;


/**
 * @author rudsonkiyoshi
 *
 */
public interface UsuarioService {
	
	/**
	 * Metodo de servico responsavel por carregar os dados do usuario
	 * @param id
	 * @return
	 * @throws ServiceException
	 */
	User loadUser(Long id) throws ServiceException;	
}

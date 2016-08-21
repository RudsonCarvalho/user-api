package br.com.rudson.carvalho.usuario.service;

import javax.ejb.Stateless;
import javax.inject.Inject;

import br.com.rudson.carvalho.service.exception.ServiceException;
import br.com.rudson.carvalho.usuario.model.User;
import br.com.rudson.carvalho.usuario.model.dao.UsuarioDao;

@Stateless
public class UsuarioServiceImpl implements UsuarioService {

	@Inject
	private UsuarioDao usuarioDao;

	@Override
	public User loadUser(Long id) throws ServiceException {

		try {
			return usuarioDao.loadUser(id);
		} catch (Exception e) {
			throw new ServiceException(e.getMessage(), e);
		}
	}

}

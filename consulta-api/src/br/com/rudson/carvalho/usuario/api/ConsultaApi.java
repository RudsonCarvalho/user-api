package br.com.rudson.carvalho.usuario.api;


import javax.ejb.EJB;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import br.com.rudson.carvalho.service.exception.ServiceException;
import br.com.rudson.carvalho.usuario.model.ErrorModel;
import br.com.rudson.carvalho.usuario.model.User;
import br.com.rudson.carvalho.usuario.service.UsuarioService;

/**
 * @author rudsonkiyoshi
 *
 */
@Named
@RequestScoped
@Path("/")
public class ConsultaApi {

	
	@Inject
	private UsuarioService usuarioService;
	
	/**
	 * @return the usuarioService
	 */
	public UsuarioService getUsuarioService() {
		return usuarioService;
	}

	/**
	 * @param usuarioService the usuarioService to set
	 */
	public void setUsuarioService(UsuarioService usuarioService) {
		this.usuarioService = usuarioService;
	}

	@GET
	@Path("/usuarios/{id}")	
	@Produces({ "application/json" })
	public Response usuariosIdGet(@PathParam("id") Long id) {

		User user = null;
		
		try {
			
			user = usuarioService.loadUser(id);
			
		} catch (ServiceException e) {
			//TODO: LOG Error 
		}

		if (user != null) {
			
			return Response.status(Status.OK).entity(user).build();
		} else {
			
			ErrorModel e = new ErrorModel();
			e.setCode(999);
			e.setMessage("Usu&#225;rio n&#227;o localizado");
			
			return Response.status(Status.NO_CONTENT).entity(e).build();
		}
	}

}

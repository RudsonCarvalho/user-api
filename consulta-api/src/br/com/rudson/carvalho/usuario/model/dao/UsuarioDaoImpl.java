package br.com.rudson.carvalho.usuario.model.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.ejb.Stateless;

import br.com.rudson.carvalho.dao.exception.DaoException;
import br.com.rudson.carvalho.usuario.model.User;


@Stateless
public class UsuarioDaoImpl implements UsuarioDao{
	
	@Override
	public User loadUser(Long id) throws DaoException {
		User user = null;
				
		try {
			  			
			//TODO: definir resource reference para lookup 
			Class.forName("com.mysql.cj.jdbc.Driver");
		    
		    final String url = "jdbc:mysql://localhost:3306/USER_DB?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";

		    Connection   connection = DriverManager.getConnection(url,"root", "root");
						
			Statement st = connection.createStatement();
					
			ResultSet rs = st.executeQuery("select ID, NOME, EMAIL, STATUS, DATA_CADASTRO, DATA_ATUALIZACAO from TB_USUARIOS where ID = ".concat(String.valueOf(id)));
			
			user = loadUserRs(rs);
			
			st.close();
		
		} catch (SQLException ex) {
			throw new DaoException(ex.getMessage(), ex);
		} catch (ClassNotFoundException e) {
			throw new DaoException(e.getMessage(), e);
		}

		return user;
	}


	private User loadUserRs(ResultSet rs) throws SQLException {

		User u = null; 
		
		if (rs != null) {
			while (rs.next()) {
				 u = new User(); 			 
				 u.setId(rs.getLong("ID"));
				 u.setNome(rs.getString("NOME"));
				 u.setEmail(rs.getString("EMAIL"));
				 u.setStatus(rs.getBoolean("STATUS"));
				 u.setDataCadastro(rs.getTimestamp("DATA_CADASTRO"));
				 
				 if (!rs.getString("DATA_ATUALIZACAO").equals("0000-00-00 00:00:00")) {
					 u.setDataAtualizacao(rs.getTimestamp("DATA_ATUALIZACAO"));
				 }
			}
		}
		return u;
	}

}

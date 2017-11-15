package mx.unam.sii.action;

import org.apache.log4j.Logger;

import com.opensymphony.xwork2.ActionSupport;

import mx.unam.sii.hibernate.Usuario;
import mx.unam.sii.hibernate.UsuarioDAO;
import mx.unam.sii.pojo.Login;

public class LoginAction extends ActionSupport{
	private static final long serialVersionUID = 1L;
	private static final Logger logger = Logger.getLogger(LoginAction.class);
	private Login login;
	
	public String loginUser() {
		logger.info("loginUsuario()");
		login.setusr("vcaf");
		login.setpwd("12345");
		logger.info("InformaciÃ³n recibida: " + login.toString());
		
		UsuarioDAO usuarioDAO = new UsuarioDAO();
		Usuario usuario = usuarioDAO.login(login);
		try {
			if( usuario == null ){ // usuario no encontrado
				addActionError("Usuario y/o contraseña inválidos");
				return "not-found";
			}
		}catch(Exception e) {
			addActionError(e.getMessage());
			return "error";
		}
		
		logger.info("Usuario encontrado: " + usuario);
		return "success";
	}
	
	/**
	 * @return the login
	 */
	public Login getLogin() {
		return login;
	}


	/**
	 * @param login the login to set
	 */
	public void setLogin(Login login) {
		this.login = login;
	}
}

package mx.unam.sii.action;

import org.apache.log4j.Logger;

import mx.unam.sii.pojo.Login;
//import mx.unam.sii.hibernate.Usuario;

public class ShowFormsAction {
	private static final Logger logger = Logger.getLogger(ShowFormsAction.class);
	
	private Login login;
	//private Usuario usr;
	
	public String showLoginForm() {
		logger.info("showLoginForm()");
		
		logger.debug("Instanciando POJO para la forma login");
		login = new Login();
		logger.info("Segun se instanció el POJO");
		return "success";
	}
	public String showMsg() {
		logger.info("Estamos en el mensaje");
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

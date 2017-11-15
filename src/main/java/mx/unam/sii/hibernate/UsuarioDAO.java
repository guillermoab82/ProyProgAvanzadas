package mx.unam.sii.hibernate;

import org.apache.log4j.Logger;
import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;

import mx.unam.sii.pojo.Login;

public class UsuarioDAO extends BaseHibernateDAO {
	private static final long serialVersionUID = 1L;
	private static final Logger logger = Logger.getLogger(UsuarioDAO.class);
	public Usuario login(Login login) {
		logger.info("UsuarioDAO");
		logger.info("Información recibida"+ login.toString());
			Criteria criteria = getSession().createCriteria(Usuario.class)
					.add( Restrictions.eq("cUSR", login.getusr()) )
					.add( Restrictions.eq("cPWD", login.getpwd()) );
			return (Usuario) criteria.uniqueResult();
	}
	public void saveUsuario(Usuario usuario) {
		super.saveOrUpdate(usuario);
	}
}

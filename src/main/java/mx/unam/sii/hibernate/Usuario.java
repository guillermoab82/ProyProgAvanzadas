package mx.unam.sii.hibernate;

//import static javax.persistence.GenerationType.IDENTITY;

import javax.persistence.Column;
import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tusuarios",catalog="sii")
public class Usuario implements java.io.Serializable {
	private static final long serialVersionUID = 1L;
	
	private int nID;
	private String cNombre;
	private String cAPP;
	private String cAPM;
	private String cDireccion;
	private String cTelefono;
	private String cUSR;
	private String cPWD;
	private int nIDTipoUSR;

	public Usuario() {}
	
	public Usuario(String Nombre,String APP,String USR,String PWD) {
		super();
		this.cNombre = Nombre;
		this.cAPP = APP;
		this.cUSR = USR;
		this.cPWD = PWD;
	}
	
	public Usuario(String Nombre,String APP,String APM,String Direccion,String Telefono,String USR,String PWD,int TipoUSR) {
		super();
		this.cNombre = Nombre;
		this.cAPP = APP;
		this.cAPM = APM;
		this.cDireccion = Direccion;
		this.cTelefono = Telefono;
		this.cUSR = USR;
		this.cPWD = PWD;
		this.nIDTipoUSR = TipoUSR;
	}
	
	@Id
	//@GeneratedValue(strategy = IDENTITY)
	@Column(name="nID",nullable=false)
	public int getnID() {
		return nID;
	}
	
	@Column(name = "cNombre", nullable = false, length = 60)
	public String getCnombre(){
		return cNombre;
	}

	public void setCnombre(String cNombre){
		this.cNombre=cNombre;
	}

	@Column(name = "cAPP", nullable = false, length = 30)
	public String getCapp(){
		return cAPP;
	}

	public void setCapp(String cAPP){
		this.cAPP=cAPP;
	}

	@Column(name = "cAPM", nullable = true, length = 30)
	public String getCapm(){
		return cAPM;
	}

	public void setCapm(String cAPM){
		this.cAPM=cAPM;
	}

	@Column(name = "cDireccion", nullable = true, length = 255)
	public String getCdireccion(){
		return cDireccion;
	}

	public void setCdireccion(String cDireccion){
		this.cDireccion=cDireccion;
	}

	@Column(name = "cTelefono", nullable = true, length = 20)
	public String getCtelefono(){
		return cTelefono;
	}

	public void setCtelefono(String cTelefono){
		this.cTelefono=cTelefono;
	}

	@Column(name = "cUSR", nullable = false, length = 16)
	public String getCusr(){
		return cUSR;
	}

	public void setCusr(String cUSR){
		this.cUSR=cUSR;
	}

	@Column(name = "cPWD", nullable = false, length = 16)
	public String getCpwd(){
		return cPWD;
	}

	public void setCpwd(String cPWD){
		this.cPWD=cPWD;
	}
	
	@Column(name = "nIDTipoUSR", nullable = false, length = 6)
	public int getnIDTipoUSR(){
		return nIDTipoUSR;
	}

	public void setnIDTipoUSR(int TipoUSR){
		this.nIDTipoUSR=TipoUSR;
	}
	

}

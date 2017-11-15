package mx.unam.sii.pojo;

public class Login {
	private String usr;
	private String pwd;
	
	public String getusr() {
		return this.usr;
	}
	public void setusr(String usr) {
		this.usr=usr;
	}
	
	public String getpwd() {
		return this.pwd;
	}
	public void setpwd(String pwd) {
		this.pwd=pwd;
	}
	@Override
	public String toString() {
		StringBuilder stringBuilder = new StringBuilder();
		stringBuilder.append("Login [usr=");
		stringBuilder.append(usr);
		stringBuilder.append(", password=");
		stringBuilder.append(pwd);
		stringBuilder.append("]");
		return stringBuilder.toString();
	}
}

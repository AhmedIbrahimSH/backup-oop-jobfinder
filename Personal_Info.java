package models;
import java.util.Properties;
import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.internet.MimeMessage;
public class Personal_Info {
	
	private String name;
	private String email;
	private String password;
	private String title;
	

	public Personal_Info(String name, String email, String password, String title) {
		this.name = name;
		this.email = email;
		this.password = password;
		this.title = title;
	}
	
	

	public Personal_Info() {
	
}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	


	

}

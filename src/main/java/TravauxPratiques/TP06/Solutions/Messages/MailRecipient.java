package TravauxPratiques.TP06.Solutions.Messages;

/**
 * TP Week 6
 * Exercise W6Q3 2
 * 
 * Class : MailRecipient.java
 * Description: MailRecipient
 * Authors: Florian Doche
 * Date of creation: 01.02.2009
 * Last update: 24.03.2010
 * 
 */
 
public class MailRecipient extends Recipient {
	private String mail;
	
	public MailRecipient(String name, String firstName, String mail) {
		super(name, firstName);
		this.mail = mail;
	}
	
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
}

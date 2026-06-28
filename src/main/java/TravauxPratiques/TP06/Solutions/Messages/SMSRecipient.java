package TravauxPratiques.TP06.Solutions.Messages;

/**
 * TP Week 6
 * Exercise W6Q3 2
 * 
 * Class : SMSRecipient.java
 * Description: SMSRecipient
 * Authors: Florian Doche
 * Date of creation: 01.02.2009
 * Last update: 24.03.2010
 * 
 */
 
public class SMSRecipient extends Recipient {
	private String phoneNumber;
	
	public SMSRecipient(String name, String firstName, String phoneNumber) {
		super(name, firstName);
		this.phoneNumber = phoneNumber;
	}
	
	public String getPhoneNumber() {
		return phoneNumber;
	}
	
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
}

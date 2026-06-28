package TravauxPratiques.TP06.Solutions.Messages;

/**
 * TP Week 6
 * Exercise W6Q3 2
 * 
 * Class : Recipient.java
 * Description: Recipient
 * Authors: Florian Doche
 * Date of creation: 01.02.2009
 * Last update: 24.03.2010
 * 
 */
 
public class Recipient {
	private String name;
	private String firstName;
	
	public Recipient(String name, String firstName) {
		this.name = name;
		this.firstName = firstName;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
}

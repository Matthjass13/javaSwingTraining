package TravauxPratiques.TP06.Solutions.Messages;

/**
 * TP Week 6
 * Exercise W6Q3 2
 * 
 * Class : Message.java
 * Description: Message
 * Authors: Florian Doche
 * Date of creation: 01.02.2009
 * Last update: 24.03.2010
 * 
 */
 
public class Message {
	private String text;

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}
	
	public void send() {
		System.out.println("Text du message : " + text);
	}
}

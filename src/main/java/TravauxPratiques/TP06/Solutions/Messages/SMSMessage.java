package TravauxPratiques.TP06.Solutions.Messages;

/**
 * TP Week 6
 * Exercise W6Q3 2
 * 
 * Class : SMSMessage.java
 * Description: SMSMessage
 * Authors: Florian Doche
 * Date of creation: 01.02.2009
 * Last update: 24.03.2010
 * 
 */
 
public class SMSMessage extends Message {
	private static final int NBCHARMAX = 120;
	private SMSRecipient[] recipients;
	private SMSRecipient recipient;
	
	public SMSMessage(String text, SMSRecipient recipient) {
		setText(text);
		this.recipient = recipient;
	}
	
	public SMSMessage(String text, SMSRecipient[] recipients) {
		setText(text);
		this.recipients = recipients;
	}
	
	public void send() {
		System.out.println("*** Sending SMS to ***");
		if (recipients != null)
			for(int i=0;i<recipients.length;i++)
				sendToRecipient(recipients[i]);
		else
			sendToRecipient(this.recipient);
		
		System.out.println();
		System.out.println("Message : " + this.getText());
	}
	
	private void sendToRecipient(SMSRecipient recipient) {
		System.out.println("Name : " + recipient.getName() + " " + recipient.getFirstName());
	}
		
	public void setText(String text) {
		if (text.length() > NBCHARMAX)
			super.setText(text.substring(0, NBCHARMAX-1));
		else
			super.setText(text);
	}

	public SMSRecipient[] getRecipients() {
		return recipients;
	}

	public void setRecipients(SMSRecipient[] recipients) {
		this.recipients = recipients;
	}

	public SMSRecipient getRecipient() {
		return recipient;
	}

	public void setRecipient(SMSRecipient recipient) {
		this.recipient = recipient;
	}
}

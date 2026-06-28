package TravauxPratiques.TP06.Solutions.Messages;

/**
 * TP Week 6
 * Exercise W6Q3 2
 * 
 * Class : MailMessage.java
 * Description: MailMessage
 * Authors: Florian Doche
 * Date of creation: 01.02.2009
 * Last update: 24.03.2010
 * 
 */
 
public class MailMessage extends Message {
	private static final int NBCHARMAX = 600;
	private MailRecipient[] recipients;
	private MailRecipient recipient;
	
	public MailMessage(String text, MailRecipient recipient) {
		setText(text);
		this.recipient = recipient;
	}
	
	public MailMessage(String text, MailRecipient[] recipients) {
		setText(text);
		this.recipients = recipients;
	}
	
	public void send() {
		System.out.println("*** Sending mail to ***");
		if (recipients != null)
			for(int i=0;i<recipients.length;i++)
				sendToRecipient(recipients[i]);
		else
			sendToRecipient(this.recipient);
		
		System.out.println();
		System.out.println("Message : " + this.getText());
	}
	
	private void sendToRecipient(MailRecipient recipient) {
		System.out.println("Name : " + recipient.getName() + " " + recipient.getFirstName());
	}
		
	public void setText(String text) {
		if (text.length() > NBCHARMAX)
			super.setText(text.substring(0, NBCHARMAX-1));
		else
			super.setText(text);
	}

	public MailRecipient[] getRecipients() {
		return recipients;
	}

	public void setRecipients(MailRecipient[] recipients) {
		this.recipients = recipients;
	}

	public MailRecipient getRecipient() {
		return recipient;
	}

	public void setRecipient(MailRecipient recipient) {
		this.recipient = recipient;
	}
}

package TravauxPratiques.TP06.Solutions.Messages;

/**
 * TP Week 6
 * Exercise W6Q3 2
 * 
 * Class : TestsMessage.java
 * Description: TestsMessage
 * Authors: Florian Doche
 * Date of creation: 01.02.2009
 * Last update: 24.03.2010
 * 
 */
public class TestsMessage {
	public static void main(String[] args) {
		MailRecipient mailFriend = new MailRecipient("Paul", "Prebois", "paul@prebois.ch");
		SMSRecipient smsFriend = new SMSRecipient("Paul", "Prebois", "078 123 45 67");
		
		MailMessage m = new MailMessage("salut", mailFriend);
		SMSMessage s = new SMSMessage("ciao", smsFriend);
		
		m.send();
		s.send();
	}
}

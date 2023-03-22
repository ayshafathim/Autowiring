package UstBatch.Com.autowiring;

public class SMSServices implements messageServices {

	public void SentMessage(String message) {
		
		System.out.println("I am from SMS services : "+ message);
	}

}

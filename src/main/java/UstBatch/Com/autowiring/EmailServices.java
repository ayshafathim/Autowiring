package UstBatch.Com.autowiring;

public class EmailServices  implements messageServices{

	public void SentMessage(String message) {
		
		System.out.println("I am from email services : "+ message);
	}

}

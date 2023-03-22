package UstBatch.Com.autowiring;

public class NotificationServices {
	
	public void setMessageservices(messageServices messageservices) {
		this.messageservices = messageservices;
	}
	private messageServices messageservices;
	public void notifyy() {
		messageservices.SentMessage("Hey i am autowired");
	}

}

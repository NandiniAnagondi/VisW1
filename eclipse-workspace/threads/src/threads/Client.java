package threads;

public class Client {
	
	public static void main(String[] args) {
		
			Resource t1=new Resource(1,ResourceType.PRODUCER);
			Resource t2=new Resource(2,ResourceType.PRODUCER);
			Resource t3=new Resource(ResourceType.CONSUMER);
			Resource t4=new Resource(ResourceType.CONSUMER);
			t1.start();
			t2.start();
			t3.start();
			t4.start();
		
	}

}

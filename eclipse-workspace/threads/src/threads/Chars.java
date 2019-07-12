package threads;

public class Chars implements Runnable {

	@Override
	public void run() {
			
		for (int i = 'A'; i <= 'z'; i++) {
			
	               System.out.println(Thread.currentThread()+":"+(char)i);
	               
		}
	}

}

package threads;

public class NAccountClient {

	public static void main(String[] args) {

			NAccount account=new NAccount(5000);
			NTranscationThread t1=new NTranscationThread(account, TranscationType.CREDIT,"Roger",2000);
			NTranscationThread t2=new NTranscationThread(account, TranscationType.CREDIT,"\tAmy",3500);
			NTranscationThread t3=new NTranscationThread(account, TranscationType.DEBIT,"\t\tcalvin",7000);
			
			t3.start();
			t1.start();
		    t2.start();
			
			try {
				t1.join();t2.join();t3.join();
			}catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("Final Balance: " + account.getBalance());
	}

}

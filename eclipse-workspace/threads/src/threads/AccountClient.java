package threads;

public class AccountClient {

	public static void main(String[] args) {

			Account account=new Account(5000);
			TranscationThread t1=new TranscationThread(account, TranscationType.CREDIT,"Roger",2000);
			TranscationThread t2=new TranscationThread(account, TranscationType.CREDIT,"\tAmy",3500);
			TranscationThread t3=new TranscationThread(account, TranscationType.DEBIT,"\t\tcalvin",7000);
			t3.start();
			try {
				Thread.sleep(10);;
			}catch (InterruptedException e) {
				e.getStackTrace();
			}
			
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

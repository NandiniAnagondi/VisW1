package threads;

public class TranscationThread extends Thread {
	private Account account;
	private TranscationType type;
	private String name;
	private double amt;
	
	public TranscationThread(Account account, TranscationType type, String name, double amt) {
		super();
		this.account = account;
		this.type = type;
		this.name = name;
		this.amt = amt;
	}
	
	@Override
	public void run() {
		if(type==TranscationType.CREDIT) {
			account.deposit(name, amt);
		}else {
			account.withdraw(name, amt);
		}
	}
	

}

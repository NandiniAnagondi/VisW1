package threads;

public class Resource extends Thread{
	private int data;
	private ResourceType type;
    private boolean flag=false;

	public Resource(int data, ResourceType type) {
		super();
		this.data = data;
		this.type = type;
		
	}

	public Resource(ResourceType type) {
		super();
		this.type = type;
		
	}


	public boolean isFlag() {
		return flag;
	}

	public void setFlag(boolean flag) {
		this.flag = flag;
	}

	public synchronized void getData(boolean flag) {
			
		if(flag==true) {
		System.out.println(data);
		setFlag(false);
		notifyAll();
		}else {
			try {
				wait(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	public synchronized void setData(int data,boolean flag) {
		if(flag==false) {
		this.data = data;
		setFlag(true);
		notifyAll();
		}
		else {
			try {
				wait(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
	@Override
	public void run() {
		if(type==ResourceType.CONSUMER) {
			getData(isFlag());
		}
		else {
			  setData(data,!isFlag());
			}
	     }
	}
	


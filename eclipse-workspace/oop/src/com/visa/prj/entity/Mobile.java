package com.visa.prj.entity;

public class Mobile extends Product {
	
	private String connectivity;
	
	public Mobile(int id, String name, double price, String connectivity) {
		super(id, name, price);
		this.connectivity = connectivity;
	}

	public Mobile() {
		super();
	}

	public String getConnectivity() {
		return connectivity;
	}

	public void setConnectivity(String connectivity) {
		this.connectivity = connectivity;
	}
	@Override
	public boolean isExpense() {
		// TODO Auto-generated method stub
		if("3G".equals(connectivity)&& getPrice()> 4000) {
			return true;
		}
		if("4G".equals(connectivity)&& getPrice()> 1500) {
			return true;
		}
			return false;
		
	}
	

}

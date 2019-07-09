package com.visa.prj.entity;

public class Time {
	private int hrs;
	private int mins;
	
	public Time(int a, int b){
		hrs=a;
		mins=b;
	}
	public int gethrs(){
		return hrs;
	}
	public int getmins() {
		return mins;
	}
	public static Time addtime(Time t1, Time t2) {
		Time t3=new Time(0,0);
		t3.mins=t1.mins+t2.mins;
        if(t3.mins>=60) {
        	t3.mins-=60;
        	t3.hrs++;
        }
		t3.hrs=t3.hrs+t1.hrs+t2.hrs;
		if(t3.hrs>=24) {
			t3.hrs-=24;
		}
      return t3;
	}
	public Time addtim(Time t2) {
		Time t3=new Time(0,0);
		t3.mins=this.mins+t2.mins;
        if(t3.mins>=60) {
        	t3.mins-=60;
        	t3.hrs++;
        }
		t3.hrs=t3.hrs+this.hrs+t2.hrs;
		if(t3.hrs>=24) {
			t3.hrs-=24;
		}
      return t3;
		
	}

}

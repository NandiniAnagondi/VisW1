package com.visa.prj.client;

@FunctionalInterface
interface Computation{
	int compute(int x, int y);
	//int add(int x,int y);
}

public class TestAnonymous {
	
   public static void main(String[] args) {
	   
	   Computation c1=new Computation() {
		
		@Override
		public int compute(int x, int y) {
			// TODO Auto-generated method stub
			return x + y;
		}
	};
	System.out.println(c1.compute(3, 4));
	
	Computation c2=(int x, int y)->{
		return x-y;
	};
	System.out.println(c2.compute(4,3));
	
	Computation c3=(x,y)-> x*y;
	System.out.println(c3.compute(3,4));
	
   }
}

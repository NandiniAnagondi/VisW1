package com.visa.prj.client;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListSecondExample {
	
		public static void main(String[] args) {
			
			List<Integer> i1=Arrays.asList(1,2,3,4,5);
			List<String> i2=Arrays.asList("a","b","c","d");
		    print(i1);
		    print(i2);
		    
		    List<Integer> i3=new ArrayList< >();
			List<String> i4=new ArrayList<>();
			copy(i3,i1);
			copy(i4,i2);
			System.out.println(i3);
			System.out.println(i4);
			copy1(i3,i1);
			copy1(i4,i2);
		}

		private static <T> void copy(List<T> a, List<T> b) {
			for(T o : b) {
				a.add(o);
			}
			// TODO Auto-generated method stub
		}
//doubt
		private static <T> void copy1(List<? super T> a, List<? extends T> b) {
			for(T o : b) {
				a.add(o);
			}
			// TODO Auto-generated method stub
		}

		private static void print(List<?> i1) {
			//can view but cannot mutate
			System.out.println(i1);
			// TODO Auto-generated method stub
			
		}
		

}

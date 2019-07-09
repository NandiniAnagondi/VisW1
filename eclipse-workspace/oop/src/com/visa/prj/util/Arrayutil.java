package com.visa.prj.util;

import java.util.Arrays;

public class Arrayutil {
	
	public static void sort(Comparable[] elems) {
		for (int i = 0; i < elems.length; i++) {
			for (int j = i+1; j < elems.length; j++) {
				if (elems[i].compareTo(elems[j])>0) {
					Comparable temp=elems[i];
					elems[i]=elems[j];
					elems[j]=temp;
				}
				
			}
			
		}
	}
	/**
	 * 
	 * @param data
	 * @return
	 */

	public static int getsum(int[] data) {
		int sum=0;
	  for(int i=0;i<data.length;i++) {
		  sum+=data[i];
	  }
	  return sum;
	}
	public static void sort(int[] elems) {
		
		Arrays.sort(elems);
		
	}
	/**
	 * 
	 * @param elems
	 * @param no
	 * @return
	 */
	public static int getcount(int[] elems, int no) {
		int count=0;
		  for(int i=0;i<elems.length;i++) {
			  if(no==elems[i])
			     count++;
		  }
		  return count;
	}
	public static int[] convert(int[][] data) {
		int size=data.length * data[0].length;
		int[] array=new int[size];
		int k=0;
		for(int i=0;i<data.length;i++)
		{
			for(int j=0;j<data[0].length;j++) {
				array[k++]=data[i][j];
			}
		}
		return array;
	}
}

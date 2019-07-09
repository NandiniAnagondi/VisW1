package com.visa.prj.client;

import com.visa.prj.entity.Mobile;
import com.visa.prj.entity.Product;
import com.visa.prj.entity.Tv;
import com.visa.prj.util.Arrayutil;

public class SortClient {
	
	public static void main(String[] args) {
		String[] names= {"calvin","george","nandini","yuva","nikhil"};
		Arrayutil.sort(names);
		
	   for (String string : names) {
		System.out.println(string);
	}
	   Product[] products=new Product[4];
	    products[0]=new Tv(133,"sony",13500,"LED");
	    products[1]=new Mobile(134,"Motog",14500,"4G");
	    products[2]=new Tv(135,"onida",15500,"LED");
	    products[3]=new Mobile(136,"iphone xr",16500,"4G");
	    Arrayutil.sort(products);
	    
	    
  }
}

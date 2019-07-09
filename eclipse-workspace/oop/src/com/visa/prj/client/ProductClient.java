package com.visa.prj.client;

import java.lang.reflect.Method;

import com.visa.prj.entity.Mobile;
import com.visa.prj.entity.Product;
import com.visa.prj.entity.Tv;

public class ProductClient {
	
 public static void main(String[] args) {
	 Product[] products=new Product[4];
	
    products[0]=new Tv(133,"sony",13500,"LED");
    products[1]=new Mobile(134,"Motog",14500,"4G");
    products[2]=new Tv(135,"onida",15500,"LED");
    products[3]=new Mobile(136,"iphone xr",16500,"4G");
    
    printExpensive(products);
    printInfo(products);
    printInfoOCP(products);   
    }
 
 /*
  * print details using open for extension
  * done using reflection APIs
  */

private static void printInfoOCP(Product[] products) {
	// TODO Auto-generated method stub
	for (Product p : products) {
		Class<? extends Product> clazz=p.getClass();
		System.out.println("Hello:" + clazz);
		Method[] method=clazz.getMethods();
		System.out.println("Hello1:" + method);
		for(Method m:method) {
			if(m.getName().startsWith("get")) {
				try {
					Object ret=m.invoke(p);
					System.out.println("Hi:" + ret);
				}
				catch(Exception e) {
					e.printStackTrace();
				}
			}
		}
		
	}
}

private static void printInfo(Product[] products) {
	// TODO Auto-generated method stub
	for (Product p : products) {
		
		System.out.println(p.getName() + ":" + p.getPrice());
		if( p instanceof Tv) {
			Tv t=(Tv) p;
			System.out.println(t.getScreenType());
		}
	    if(p.getClass()==Mobile.class) {
	    	Mobile m=(Mobile) p;
	    	System.out.println(m.getConnectivity());
	    }
	    System.out.println("****");
		
	}
}

private static void printExpensive(Product[] products) {
	for (Product product : products) {
		if(product.isExpense()) {
			System.out.println(product.getName() + " isExpense!");
		}
	}
	// TODO Auto-generated method stub
	
  }
}

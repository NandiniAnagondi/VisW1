package com.visa.prj.client;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

import com.visa.prj.entity.Product;

public class WeakExample {
	
	 public static void main(String[] args) {
		
		 Map<String,Integer> map=new HashMap<>();
		 String s=new String("java");
		 map.put(s,52);
		 s=null;
		 
		 System.gc();
		 try {
				Thread.sleep(1000);
			} catch(InterruptedException e) {
				e.printStackTrace();
			}
		
			System.out.println(map.get("java"));
			Product p=new Product(645,"Hp Laptop",135000.00,"computer",100);
		
			Map<String,Object> map1=storeinfo(p);
			System.out.println(map1);
			String str="java is oop and java is ditributed and java is simple";
			Map<String,Integer> m1=getWordFrequency(str);
			System.out.println(m1);
	}

	private static Map<String, Integer> getWordFrequency(String str) {
		Map<String,Integer> m2=new HashMap<String,Integer>();
		String[] str1=str.split(" ");
		for (int i = 0; i < str1.length; i++) {
			if(m2.containsKey(str1[i])) {
				
				int count=m2.get(str1[i]);
			     m2.put(str1[i],count+1);
			}
			else {
				m2.put(str1[i],1);
				}
			
		}
		// TODO Auto-generated method stub
		return m2;
	}

	private static Map<String, Object> storeinfo(Product p) {
		
		Map<String,Object> map=new HashMap<>();
		// TODO Auto-generated method stub
		Class cls = p.getClass(); 
		Method[] methods = cls.getMethods(); 
		for(Method m:methods) {
			if(m.getName().startsWith("get")) {
				try {
					Object ret=m.invoke(p);
					map.put(m.getName().substring(3),ret);
				}
				catch(Exception e) {
					e.printStackTrace();
				}
			}
		}
	   return map;
	}

}

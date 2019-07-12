package com.visa.prj.client;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.stream.Collectors;

import com.visa.prj.entity.Product;

public class ListClient {
	
	public static void main(String[] args) {
            
	List<Product> products = new ArrayList<>();
	products.add(new Product(645,"Hp Laptop",135000.00,"computer",100));
	products.add(new Product(224,"iPhone",98000.00,"mobile",500));
	products.add(new Product(834,"Logitech Mouse",600.00,"computer",300));
	products.add(new Product(5,"Sony Bravia",125000.00,"tv",900));
	products.add(new Product(912,"One Plus",32000.00,"mobile",100));
	products.add(new Product(88,"HP Printer",19000.00,"computer",100));	
	Map<String,List<Product>> map=products.stream().collect(Collectors.groupingBy(p->p.getCategory()));
	
	System.out.println("**");
	map.forEach((k,v)->{
		System.out.println(k);
		v.forEach(System.out::println);
	});
	
	Collections.sort(products, (a,b)-> Double.compare(a.getPrice(),b.getPrice()));
	for (Product product : products) {
		//System.out.println(product);
		
	}
	
	List<Product> list=new CopyOnWriteArrayList<>(products);
	Iterator<Product> iter1=list.iterator();
	while(iter1.hasNext()) {
		Product p=iter1.next();
		products.add(new Product());
		//System.out.println(p);
	 }
	Iterator<Product> iter=products.iterator();
	while(iter.hasNext()) {
		Product p=iter.next();
		System.out.println(p);
	 }
  }
}

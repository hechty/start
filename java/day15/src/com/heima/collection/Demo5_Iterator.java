package com.heima.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Demo5_Iterator {
	public static void main(String[] args){
		Collection c = new ArrayList();
		c.add("a");
		c.add("b");
		c.add("b");
		c.add("b");
		Iterator it = c.iterator();
//		boolean b = it.hasNext();
//		Object obj1 = it.next();
//		System.out.println(obj1);
//		
//		boolean b2 = it.hasNext();
//		Object obj2 = it.next();
//		System.out.println(obj2);
//		
		while(it.hasNext()){
			System.out.println(it.next());
		}
		
	}

}

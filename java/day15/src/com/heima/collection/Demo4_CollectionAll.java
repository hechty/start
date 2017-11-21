package com.heima.collection;

import java.util.ArrayList;
import java.util.Collection;

public class Demo4_CollectionAll {
	public static void main(String [] args){
		Collection c1 = new ArrayList();
		c1.add("a");
		c1.add("b");
		c1.add("c");
		c1.add("d");
		
		Collection c2 = new ArrayList();
		c2.add("a");
		c2.add("b");
		c2.add("c");
		c2.add("c");
		c2.add("c");
		c2.add("c");

		
		boolean b = c1.retainAll(c2);
		System.out.println(b);
		System.out.println(c1);
		
	}

	private static void demo1() {
		Collection c1 = new ArrayList();
		c1.add("a");
		c1.add("b");
		c1.add("c");
		c1.add("d");
		
		Collection c2 = new ArrayList();
		c2.add("a");
		c2.add("b");
		c2.add("c");
		c2.add("f");
		
		c1.addAll(c2);
		System.out.println(c1);
	}

}

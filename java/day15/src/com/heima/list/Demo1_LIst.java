package com.heima.list;

import java.util.ArrayList;
import java.util.List;

public class Demo1_LIst {
	public static void main(String[] args){
//		demo1();
//		demo2();
//		demo3();
//		demo4();
		List list = new ArrayList();
		list.add("a");
		list.add("b");
		list.add("c");
		list.add("d");
		list.set(1, "haha");
		System.out.println(list);
		
	}

	private static void demo4() {
		List list = new ArrayList();
		list.add("a");
		list.add("b");
		list.add("c");
		list.add("d");
		
//		Object obj = list.get(3);
//		System.out.println(obj);
		for(int i = 0; i < list.size(); i++){
			System.out.println(list.get(i));
		}
	}

	private static void demo3() {
		List list = new ArrayList();
		list.add(new Integer(111));
		list.add(new Integer(222));
		list.add(new Integer(333));
//		list.remove(111);
		System.out.println(list);
	}

	private static void demo2() {
		List list = new ArrayList();
		list.add("a");
		list.add("b");
		list.add("c");
		
		Object obj = list.remove(1);
		System.out.println(obj);
		System.out.println(list);
	}

	private static void demo1() {
		List list = new ArrayList();
		list.add("a");
		list.add("b");
		list.add("c");
		list.add("d");
		list.add(1, "f");
		list.add(5,"e");
		System.out.println(list);
	}

}

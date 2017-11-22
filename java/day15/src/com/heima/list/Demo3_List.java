package com.heima.list;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Demo3_List {
	public static void main(String[] args){
		List list = new ArrayList();
		list.add("a");
		list.add("b");
		list.add("world");
		list.add("c");
//		Iterator it = list.iterator();
//		while(it.hasNext()){
//			String s = (String)it.next();
//			if("world".equals(s)){
//				list.add("javaee");
//			}
//		}
		ListIterator it = list.listIterator();
		
		while(it.hasNext()){
			String s = (String)it.next();
			if("world".equals(s)){
				it.add("haha");
			}
		}
		
		System.out.println(list);
	}

}

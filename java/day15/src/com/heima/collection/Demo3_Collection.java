package com.heima.collection;

import java.util.ArrayList;
import java.util.Collection;

import com.heima.bean.Student;

public class Demo3_Collection {
	public static void main(String[] args){
//		demo1();
		Collection c = new ArrayList();
		c.add(new Student("张三",23));
		c.add(new Student("张三",23));
		c.add(new Student("张三",23));
		c.add(new Student("张三",23));
		
		Object [] arr = c.toArray();
		for(int i = 0; i < arr.length; i ++){
			Student s = (Student) arr[i];
			System.out.println(s.getName() + "..." + s.getAge());
		}
		
	}

	private static void demo1() {
		Collection c = new ArrayList();
		c.add("a");
		c.add("b");
		c.add("c");
		c.add("d");
		Object [] arr = c.toArray();
		for(int i = 0; i < arr.length; i++){
			System.out.println(arr[i]);
		}
	}

}

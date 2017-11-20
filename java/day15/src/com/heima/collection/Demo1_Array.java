package com.heima.collection;

import com.heima.bean.Student;

public class Demo1_Array {
	public static void main(String [] args){
		Student [] arr = new Student[5];
		arr[0] = new Student("zhangsan", 23);
		arr[1] = new Student("l4", 23);
		arr[2] = new Student("w5", 25);
		arr[3] = new Student("LI6", 26);
		arr[4] = new Student("zh7", 27);
		
		for(int i = 0; i < arr.length; i++){
			System.out.println(arr[i]);
		}
	}

}

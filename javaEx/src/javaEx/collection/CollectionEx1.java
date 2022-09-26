package javaEx.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;


public class CollectionEx1 {
	
	public static void main(String[] args) {
		
		ArrayList<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(5);
		list.add(3);
		list.add(2);
		
		Collections.sort(list);
		System.out.println("list: "+list);
		
		System.out.println("=======================================");
		String[] array = {"Hello", "hello", "Hi", "HI"};
		Arrays.sort(array);
		System.out.println(Arrays.toString(array));
		
	}

}

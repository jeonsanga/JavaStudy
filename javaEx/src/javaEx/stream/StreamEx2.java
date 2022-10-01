package javaEx.stream;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Function;

public class StreamEx2 {
	
	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(1,-5,2,-7,-3);
		list.stream().map(Math::abs).forEach(System.out::println);
		
		 List<String> words = Arrays.asList("ABC", "CD", "EFG");
		 words.stream().map(String::toLowerCase).forEach(System.out::println);
		 
		 //매개변수가 잇는 생성자 
		 BiFunction<Integer, String, Student> constructor1; 
		 constructor1 = Student::new;
		 BiFunction<String, String, Student2> constructor; 
		 constructor = Student2::new;
		 
		
	}

}

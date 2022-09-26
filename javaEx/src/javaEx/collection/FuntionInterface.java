package javaEx.collection;

import java.util.function.Supplier;

public class FuntionInterface {
	
	public static void main(String[] args) {
		//함수형 인터페이스
		//함수혀 인터페이스를 사용하는 이유는 자바의 람다식은 함수형 인터페이스로만 접근이 되기때문입니다.
		Runnable runnable = ()->System.out.println("run anything");
		runnable.run();
		
		//Supplier 인자를 받지않고 t타입의 객체 리턴
		Supplier<String> getString = ()->"happy";
		String str = getString.get();
		System.out.println(str);
		
	}
}

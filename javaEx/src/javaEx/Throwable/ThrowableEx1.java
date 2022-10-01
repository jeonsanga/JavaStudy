package javaEx.Throwable;

public class ThrowableEx1 {
	
	public static void method1() {
		method2();
	}
	public static void method2() {
		System.out.println(5/0);//예외발생
	}
	
	public static void main(String[] args) {
		try {
			method1();
		} catch (Throwable e) {
			e.printStackTrace();
			e.getMessage().charAt(0);
		}
	}

}

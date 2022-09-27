package javaEx.ThreadEx;

public class Test {
	
	
	//내부 클래스 - Runnable 구현
    class threeThread implements Runnable{
        @Override
        public void run() {
            System.out.println("3");
        }
    }
	
	//내부 클래스 - Runnable 구현
    class fourthThread implements Runnable{
        @Override
        public void run() {
            System.out.println("4");
        }
    }
    
    public static void main(String[] args) {
		Test t = new Test();
		
		//스레드1
		FirstThread th1 = new FirstThread();
		//th1.start();
	}

}

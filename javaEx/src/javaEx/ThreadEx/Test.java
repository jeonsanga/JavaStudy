package javaEx.ThreadEx;

public class Test {
	
	
	//���� Ŭ���� - Runnable ����
    class threeThread implements Runnable{
        @Override
        public void run() {
            System.out.println("3");
        }
    }
	
	//���� Ŭ���� - Runnable ����
    class fourthThread implements Runnable{
        @Override
        public void run() {
            System.out.println("4");
        }
    }
    
    public static void main(String[] args) {
		Test t = new Test();
		
		//������1
		FirstThread th1 = new FirstThread();
		//th1.start();
	}

}

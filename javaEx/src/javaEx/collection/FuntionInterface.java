package javaEx.collection;

import java.util.function.Supplier;

public class FuntionInterface {
	
	public static void main(String[] args) {
		//�Լ��� �������̽�
		//�Լ��� �������̽��� ����ϴ� ������ �ڹ��� ���ٽ��� �Լ��� �������̽��θ� ������ �Ǳ⶧���Դϴ�.
		Runnable runnable = ()->System.out.println("run anything");
		runnable.run();
		
		//Supplier ���ڸ� �����ʰ� tŸ���� ��ü ����
		Supplier<String> getString = ()->"happy";
		String str = getString.get();
		System.out.println(str);
		
	}
}

package javaEx.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamCollectEx {
	
	public static void main(String[] args) {
		
		int[] arr = {1,1,10,30,2};
		List<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(1);
		list.add(10);
		list.add(30);
		list.add(2);
		
		//box()�޼ҵ�� int��ü�δ� collection�� ����� ������ IntegerŬ�����η� ��ȯ�Ͽ�
		//List<Integer>�� ��� ���� ����� ������ 
		System.out.println(Arrays.stream(arr).boxed().distinct());
		System.out.println(list.stream().max(Integer::compare));
		//�޼��� ����
		
		//�迭�� ��ȯ
		int[] arr2 = Arrays.stream(arr).distinct().toArray();
		//�𿭰� ����Ʈ ���� 
		//�迭 : ���ӵ� �޸𸮰����� �Ҵ�ǰ�, ����Ʈ�� ��� �޸𸮰� �������� ������ �����ʰ� ������带 ����Ű�� �ּҰ��� �������ִ�.
		//������ �������� ������ �������ְ�, ���� ���� �۾��� ���� Ư����ġ�� �����͸� ��ȸ�ϴ� �۾��� ����
		
		
		//list�� ��ȯ
		List<Integer> list2 = Arrays.stream(arr).boxed().distinct().collect(Collectors.toList());
	}

}

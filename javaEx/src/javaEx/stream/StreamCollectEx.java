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
		
		//box()메소드는 int자체로는 collection에 못담기 때문에 Integer클래스로로 변환하여
		//List<Integer>로 담기 위해 기능을 수행함 
		System.out.println(Arrays.stream(arr).boxed().distinct());
		System.out.println(list.stream().max(Integer::compare));
		//메서드 참조
		
		//배열로 반환
		int[] arr2 = Arrays.stream(arr).distinct().toArray();
		//뱅열과 리스트 차이 
		//배열 : 연속된 메모리공간에 할당되고, 리스트이 경우 메모리가 연속적인 공간에 있지않고 다음노드를 가리키는 주소값을 가지고있다.
		//저장할 데이터의 개수가 정해져있고, 삽입 삭제 작업이 적고 특정위치의 데이터를 조회하는 작업이 많다
		
		
		//list로 반환
		List<Integer> list2 = Arrays.stream(arr).boxed().distinct().collect(Collectors.toList());
	}

}

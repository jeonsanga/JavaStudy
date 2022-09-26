package javaEx.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ListMap {

	public static void main(String[] args) {
		
		Map<String, Object> mapData1 = new HashMap<>();
		mapData1.put("name", "데이터 1");
		mapData1.put("seq", 1);
				
		Map<String, Object> mapData2 = new HashMap<>();
		mapData2.put("name", "데이터 2");
		mapData2.put("seq", 2);
				
		Map<String, Object> mapData3 = new HashMap<>();
		mapData3.put("name", "데이터 3");
		mapData3.put("seq", 3);
				
		Map<String, Object> mapData4 = new HashMap<>();
		mapData4.put("name", "데이터 4");
		mapData4.put("seq", 4);
		 
		List<Map<String,Object>> list = new ArrayList<>();
		
		list.add(mapData4);
		list.add(mapData3);
		list.add(mapData2);
		list.add(mapData1);
		
		System.out.println("============오름 차순============");
		for (Map<String, Object> map : list) {
			System.out.println("name : " + map.get("name"));
		}
	}
}

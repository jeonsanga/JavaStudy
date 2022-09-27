package javaEx.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamEx1 {
	
	public static void main(String[] args) {
		ArrayList<Student> student = new ArrayList<Student>();
		student.add(new Student(100, "Yang"));
		student.add(new Student(80, "Cho"));
		student.add(new Student(60, "Yan"));
		student.add(new Student(60, "ha"));
		student.add(new Student(0, "yan"));
		
		student.stream()
				.filter(s->s.getScore()>70).forEach(s->System.out.println(s.getStudentNm()));
		
		
		
		List<String> list = Arrays.asList("Yanghayan", "Thanggu", "bory"); // 요소가 3개인 리스트 생성
		
		List<String> newList  = list.stream().filter(p->p.length()>5).map(p-> "[" + p + "]").collect(Collectors.toList());
		
		//Stream의 마지막에 반복처리를 실시하고싶은경우
		newList.forEach(System.out::println);
		
		//그룹 나누기 키로 점수, 값에 대응하는 학생의 List가 들어있는 map이 만들어진다
		Map<Integer, List<Student>> map = student.stream().collect(Collectors.groupingBy(Student::getScore));
		System.out.println("그룹나누기=================================================");
		
        // for loop (entrySet())       
		for (Entry<Integer, List<Student>> entrySet : map.entrySet()) {            
			System.out.println(entrySet.getKey() + " : " + entrySet.getValue());        } 
		
		
		//스트림 사용해서 list->map으로변경하는법 
		  Map<Integer, String> nameVsAgeMap = student
			         .stream()
			         .collect(Collectors.toMap(
			               Student::getScore,
			               Student::getStudentId)
			         );
		  
		  
		  List<String> names = ((Stream<Student>) list).map(Student::getStudentNm)
                  .collect(Collectors.toList());
	}

}

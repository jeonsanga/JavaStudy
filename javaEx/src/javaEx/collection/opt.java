package javaEx.collection;

import java.util.Optional;

public class opt {
	
	public static void main(String[] args) {
		Optional<Line> optSt = Optional.of(new Line("��ǿ�", "840"));
		
		Line line = optSt.get();
		System.out.println(line.toString());
	}

}

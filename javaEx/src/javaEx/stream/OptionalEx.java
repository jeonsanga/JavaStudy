package javaEx.stream;

import java.util.Optional;

public class OptionalEx {
	
	Optional<String> optional = Optional.of("abcde");
	Optional<Integer> optInt = optional.map(s->s.length());

}

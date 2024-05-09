package javaproblem;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

		public class FrequencyChar {
		    public static void main(String[] args) {
		        String str = "Hello java students";
		        
		        Map<Character, Long> freq = str.chars().mapToObj(c -> (char) c)
		                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		        
		        freq.forEach((character, frequency) -> 
		        System.out.println(character + ": " + frequency));
		    }
		

	}



package javaproblem;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;


public class JoinList {
	public static void main(String[] args) {
		List<String> listOfStrings = Arrays.asList("Abcd", "bond", "deson");
		String collect = listOfStrings.stream().map(e -> "Mr. " + e + " Hello").collect(Collectors.joining(", ", "", ""));
		System.out.println(collect);
	



	}

}

package javaproblem;

import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FrequencyArray {

	public static void main(String[] args) {
		  List<Integer> anyList = List.of(6,8,2,9,10);
		  anyList.stream().collect(Collectors.groupingBy(Function.identity(),
				  Collectors.counting()));

	}

}

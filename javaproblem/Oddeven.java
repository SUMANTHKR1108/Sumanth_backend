package javaproblem;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Oddeven {
	    public static void main(String[] args) {
	        List<Integer> list = List.of(1, 2, 3, 4, 5, 8,12,13, 10,11);

	        Map<Boolean, List<Integer>> oddEvenMap = list.stream()
	                .collect(Collectors.partitioningBy(i -> i % 2 == 0));

	        List<Integer> evenNum = oddEvenMap.get(true);
	        List<Integer> oddNum = oddEvenMap.get(false);

	        System.out.println("Even numbers: " + evenNum);
	        System.out.println("Odd numbers: " + oddNum);
	    }
	}


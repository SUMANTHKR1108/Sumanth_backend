package javaproblem;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

		public class MaxMin {

			public static void main(String[] args) {
				List<Integer> listOfIntegers = Arrays.asList(1, 2, 3, 4, 5, 10, 11, 12, 13, 14, 15);
				
				Integer max = listOfIntegers.stream().max(Comparator.naturalOrder()).get();
				System.out.println("The maximum value of list is: " + max);
				
				Integer min = listOfIntegers.stream().min(Comparator.naturalOrder()).get();
				System.out.println("The minimum value of list is: " + min);

			}

		}
	



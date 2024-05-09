package javaproblem;

import java.util.Arrays;
import java.util.stream.IntStream;

public class MergeUnsort {
	public static void main(String[] args) {
		int[] listOfInt1 = {8, 9, 12, 13, 14, 10, 1};
		int[] listOfInt2 = { 12, 13, 4, 15, 6, 7, 11, 15};
		
		int[] res = IntStream.concat(Arrays.stream(listOfInt1), Arrays.stream(listOfInt2))
				.sorted().distinct().toArray();
		for (int i : res) {
			System.out.print(i + " ");
		}
	}

}




package javaproblem;

import java.util.Arrays;
import java.util.stream.IntStream;

		public class Arraymerg {
		    public static void main(String[] args) {
		        int[] a = new int[]{10, 8, 4, 6, 5};
		        int[] b = new int[]{8, 6, 7, 61, 2};
		        int[] mergedArray = IntStream.concat(Arrays.stream(a), 
		        		Arrays.stream(b)).sorted().toArray();
		        System.out.println("Merged and Sorted Array: " + Arrays.toString(mergedArray));
		    }	
}

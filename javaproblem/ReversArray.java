package javaproblem;

import java.util.Arrays;
import java.util.Collections;

public class ReversArray {
	
		    public static void main(String[] args) {
		    	
		        Integer[] array = {1, 2, 3, 4, 5};
		       
		       Collections.reverse(Arrays.asList(array));
		        
		        Arrays.stream(array).forEach(System.out::println);
		    }
		}



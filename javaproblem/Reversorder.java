package javaproblem;

import java.util.List;
import java.util.Arrays;
import java.util.Comparator;

public class Reversorder {
	  public static void main(String[] args) {
	        List<Integer> anyList = List.of(6,8,2,9,10);
	       
	        anyList.stream().sorted(Comparator.reverseOrder())
	               .forEach(System.out::println);
	    }


}

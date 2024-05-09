package javaproblem;
import java.util.Arrays;

public class Multiple {

	public static void main(String[] args) {
		
		        Integer[] numbers = {1, 5, 10, 15, 20, 25, 30};
		        
		        Arrays.stream(numbers).filter(num -> num % 5 == 0) .forEach(System.out::println);
		    }
		

}

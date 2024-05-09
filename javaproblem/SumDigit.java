package javaproblem;

import java.util.stream.Stream;


		public class SumDigit {
			
		    public static int sumOfDigits(int inputNumber) {
		        return Stream.of(String.valueOf(inputNumber).split("")).mapToInt(Integer::parseInt)
		                .sum();
		    }

		    public static void main(String[] args) {
		        int inputNumber = 12468;
		        int sum = sumOfDigits(inputNumber);
		        System.out.println("Sum of digits: " + sum);
		    }

		}



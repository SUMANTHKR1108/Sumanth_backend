package day5;

import java.util.function.Supplier; 

public class Suppliers { 
    public static void main(String args[]) 
    { 
  
 
        Supplier<Double> randomValue = () -> Math.random(); 
  

        System.out.println(randomValue.get()); 
    } 
}
package days3;

public class Finalblock {

	public static void main(String[] args) {

		try {    
			int data=25/0; 
	        System.out.println(" try block");  
	  
	          
	       System.out.println(data);    
	      }   
	  
	      catch(ArithmeticException e){  
	        System.out.println("Exception handled");  
	        System.out.println(e);  
	      }   
	 
	      finally {  
	        System.out.println("finally block");  
	      }    
	  
	      System.out.println("try catch final block.");    
	      }    
	    

}

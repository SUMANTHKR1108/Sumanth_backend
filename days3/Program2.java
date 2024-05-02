package days3;

public class Program2 {

	public static void main(String[] args) {

				 try{    
		             int a[]=new int[5];    
		             a[5]=30/0;    
		            } 
				  catch(ArithmeticException e)  
		         {  
		          System.out.println("Arithmetic Exception");  
		         }  
				 catch(ArrayIndexOutOfBoundsException e) {
					 System.out.println("array exception");
				 }
				 catch(Exception e)  
		         {  
		          System.out.println("Exception");  
		         }             
		      System.out.println("multiple exception"); 
			}


}

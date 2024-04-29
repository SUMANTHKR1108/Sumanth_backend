import java.util.Scanner;
public class array {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		 System.out.println("enter size");
          int size=sc.nextInt();
         
          int [] arr=createArray(size);
          System.out.println("printing array");
          printArray(arr) ;
          
          int[] array = {1, 2, 3, 4, 5};
          System.out.println("revers arary");
            for(int i=0; i<array.length; i++) 
              reverseArray(array);
          
          int[] sort= sortedArray(arr);
          System.out.println(" sorted array");
          printArray(sort) ;
          
          int [] array2= {2,4,5,8,3,6};
          int [] array3= {45,56,78};
          System.out.println("mergearray");
          printArray(array);
	
	}
		public static int[] createArray(int size) {
			Scanner sc=new Scanner(System.in);
			int[] arr1=new int[size];
			for(int i=0;i<size;i++) {
			
				arr1[i]=sc.nextInt();
			}
			return  arr1;
		}
	public static void printArray(int []array) {
			for(int i=0;i<array.length;i++) {
				System.out.println(array[i]);
			}
		}	
	public static void reverseArray(int [] array) {
	        int length = array.length;
	        for (int i = 0; i < length / 2; i++) {
	            int temp = array[i];
	            array[i] = array[length - 1 - i];
	            array[length - 1 - i] = temp;
	    }
		
	}
	public static int[] sortedArray(int []array) {
		int temp=0;
		for(int i=0;i<array.length;i++) {
			for(int j=i+1;j<array.length;j++) {
				if(array[i]>array[j]) {
					temp=array[i];
					array[i]=array[j];
					array[j]=temp;
				}
			}
			
			
		}
		return array;
		
		
	}
public static void margeArray(int arr[]) {
	
	 
	}
}
		
		
		











		
		
//		
//		
//		
//		
// int[]arr= {1,2,5,6,7};
//
//
//	for( int i=0; i<arr.length; i++) {
// 
//  System.out.println(arr[i]);
//	}
//	}
//public static void  printArray (int arr1[]) {
//	System.out.println("print array");
//	Scanner sc=new Scanner(System.in);
//	int size =sc.nextInt();
//	
//	for(int j=0; j<=arr1.length; j++) {
//	 return ;
//	}
//}
//
//
//
//
//
//
//
//

	
	
















package days3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Arraylist {

	public static void main(String[] args) {

  Scanner scanner=new Scanner(System.in);{
	   List<Employ> list=new LinkedList<>();
	   while(true) {
		   System.out.println("employ id");
		   int employid=scanner.nextInt();
		   System.out.println("employ name");
		   String employName=scanner.next();
		   System.out.println("employ salary");
		   int empSal=scanner.nextInt();
		   list.add(new Employ(employid,employName,empSal));
		   System.out.println("add another employ");
		   String yes=scanner.next();
		   
		   if(!scanner.next().equalsIgnoreCase("yes")) {
			   break;
		   }
	   }
	   Collections.sort(list);
		  list.forEach(System.out::println);
	   
  }
 
		
	}

}


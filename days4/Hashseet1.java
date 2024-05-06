package days4;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;


public class Hashseet1 {

	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Set<Employ2> hs=new HashSet<>();
		while(true) {
			System.out.println("Enter empId");
			int empId=sc.nextInt();
			System.out.println("Enter empName");
			String empName=sc.next();
			System.out.println("Enter sal");
			double sal=sc.nextDouble();
			hs.add(new Employ2(empId,empName,sal));
			System.out.println("Need add another record");
			String response=sc.next();
			if(response.equalsIgnoreCase("no")) {
				break;
			}
		}
		sc.close();
		for(Employ2 em:hs) {
			System.out.println(em);
		}
	}
}
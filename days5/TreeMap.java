package day5;

import java.util.Comparator;
import java.util.Scanner;

import days4.Employe;

public class TreeMap {

	public static void main(String[] args) {
		 Scanner sc=new Scanner (System.in);
		 Comparator<Integer> com =new Comparator<Integer>() {
			 public int compare(Integer o1, Integer o2) {
				 return (o1).compareTo(02);
			 }
		 };
//		 TreeMap<Integer, Employe> tm =new TreeMap<>(com);
		 
		while(true) {
			System.out.println("Enter empId");
			int empId=sc.nextInt();
			System.out.println("Enter empName");
			String empName=sc.next();
			System.out.println("Enter sal");
			double sal=sc.nextDouble();
//			tm.put(id,new Employe (id,name,sal));
			System.out.println("add more employe");
			String res=sc.next();
			if(res.equalsIgnoreCase("no")) {
				break;
			}
		}
		sc.close();
//		for(Employe.:tm) {
			System.out.println();
		}

	}



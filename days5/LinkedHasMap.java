package day5;

import java.util.*;


public class LinkedHasMap {
    private int id;
    private String name;
    private String desig;
    private String depart;
    
    
    public LinkedHasMap(int id, String name, String design, String depart) {
        this.id = id;
        this.name = name;
        this.desig = desig;
        this.depart = depart;
    }
    
    public int getId() {
        return id;
    }
    
    public String getName() {
        return name;
    }
    
    public String getDesig() {
        return desig;
    }
    
    public String getDepart() {
        return depart;
    }
    

    public String toString() {
        return "{" +
                ", name='" + name + '\'' +
                ", designation='" + desig + '\'' +
                ", department='" + depart + '\'' +
                '}';
    }


    public static void main(String[] args) {    
        HashMap<Integer, LinkedHasMap> employees = new HashMap<>();
        employees.put(120, new LinkedHasMap(01, "Abs", "Mang", "HR"));
        employees.put(119, new LinkedHasMap(03, "bcs", "Eng", "IT"));
        employees.put(118, new LinkedHasMap(02, "Oli", "Anal", "Fin"));
        
        TreeMap<Integer, LinkedHasMap> sortedEmployees = new LinkedHasMap<>(employees);
        
        for (Map.Entry<Integer, LinkedHasMap> entry : sortedEmployees.entrySet()) {
            System.out.println("ID: " + entry.getKey() + ", Employee: " + entry.getValue());
        }
    }
}


//
//public static void main(String[] args) {
//	 Scanner sc=new Scanner (System.in);
//	 Comparator<Integer> com =new Comparator<Integer>() {
//		 public int compare(Integer o1, Integer o2) {
//			 return (o1).compareTo(02);
//		 }
//	 };
//	 TreeMap<Integer, Employe> tm =new TreeMap<>(com);
package javaproblem;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Problems {

	public static void main(String[] args) {
    	List <Integer> asList =Arrays.asList(1,2,3,4,56,78,98,56,145);
//		List <Integer> collect =asList.stream().filter(e->e%2==0).collect(Collectors.toList());
//		System.out.println(collect);
	
		
//		asList.stream().map(e-> e+"").filter(e -> e.startsWith("1")).forEach(System.out::println);
		
//		Set<Integer>Set=new HashSet();
//		asList.stream().filter(e->Set.add(e)).forEach(System.out::println);
    	
//    	Set<Integer>Set =new HashSet();asList.stream().filter(e->Set.add(e)).forEach(System.out::println);
    	
    	Integer orElse=asList.stream().findFirst().orElse(0);
    	System.out.println(orElse);
    	
    	System.out.println("max number");
    	Integer integer=asList.stream().max((o1,o2)->o1.compareTo(o2)).get();
    	System.out.println(integer);
    	
    	
    	System.out.println("first non-repeted");
    	String input="java programing";
    	Character charecter=input.chars().mapToObj(c->(char)c)
		.filter(e->input.indexOf(e) ==input.lastIndexOf(e))
		.findFirst().get();
		System.out.println(charecter);
		
		System.out.println("short all the element");
//		asList.stream().sorted(Collection.Reversorder()).forEach(System.out::println);
		
		int size=asList.stream().distinct().collect(Collectors.toList()).size();
		System.out.println(size!=asList.size());
		
		System.out.println("cube filter");
		asList.stream().map(e->e*e*e).filter(e->e>50).forEach(System.out::println);
		
		System.out.println("count each char of string");
		String input1="absjhcjdb";
		Map<Character ,Long>collect=input1.chars().mapToObj(c->(char)c).collect(Collectors.groupingBy(
				Function.identity(),Collectors.counting()));
		System.out.println(collect);
		
		System.out.println("find duplicate element");
		
		List<String>name=Arrays.asList("aa","bb","cc");
//		name.stream().filter(e->Collection.Frequency(name,e)>e).collect(Collectors.groupingBy
//				(Function.identity()
//				,Collectors.counting()));
		System.out.println();
		
		
				}

}

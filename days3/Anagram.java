package days3;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
	
		
			String a="world";
			String b="earth";

			char[]c=a.toCharArray();
			char []d=b.toCharArray();
			Arrays.sort(c);
			Arrays.sort(d);
			if(Arrays.equals(c ,d)) 
			{
				System.out.print("angram");
			}
			else 
			{
				System.out.print("not a anagram");
			}
			System.out.println("\n");
		

	}

}

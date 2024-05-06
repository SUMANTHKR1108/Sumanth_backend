package day5;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Set;

public class Hashmap {

	public static void main(String[] args) {
	LinkedHashMap<String, Integer> marks = new LinkedHashMap<>();
	marks.put("abs", 66);
	marks.put("alm", 78);
	marks.put("acs", 88);
	
	Iterator<String>iterator =marks.keySet().iterator();
//	while(iterator.hasNext()) {
//		String str=iterator.next();
//		System.out.println(str+"===>" +marks.get(str));
//	}
	Set<Entry<String,Integer>>entrySet=marks.entrySet();
	for(Entry<String,Integer> entry:entrySet) {
		System.out.println(entry.getKey()+"====>"+entry.getValue());
		
	}
	}

}



//} 
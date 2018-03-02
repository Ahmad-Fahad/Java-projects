package Intermediate_java;

import java.util.*;
//import java.util.List;

public class hashset {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] things={"pen","ball","pen","toy","cloths","computer","toy"};
		List<String> list=Arrays.asList(things);
		
		System.out.println(list);
		System.out.println();
		
		Set<String> s=new HashSet<String>(list);
		System.out.println(s);
		
	}

}

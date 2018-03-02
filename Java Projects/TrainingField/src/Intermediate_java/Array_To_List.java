package Intermediate_java;


import java.util.Arrays;
import java.util.LinkedList;

public class Array_To_List {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] stuff={"cow","donkey","Ass","ant","horse","elephant","Tiger"};
		for(String c : stuff){
			System.out.println(c+ " ");
		}
		System.out.println( );
		LinkedList<String> l=new LinkedList<String>(Arrays.asList(stuff));
		l.add("Camel");
		l.addFirst("Lion");
		
		stuff=l.toArray(new String[l.size()]);
		
		for(String x : stuff){
			System.out.println(x+ " ");
		}
		
	}

}

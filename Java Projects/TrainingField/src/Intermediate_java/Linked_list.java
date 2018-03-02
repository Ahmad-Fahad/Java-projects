package Intermediate_java;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class Linked_list {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] things={"A","B","C","D","E","F","G","H","I","J"};
		List<String> list1=new LinkedList<String>();
		for(String x : things){
			list1.add(x);
		}
		String[] more={"!","@","#","$","%","%","^","&","*"};
		List<String> list2=new LinkedList<String>();
		for(String y : more){
			list2.add(y);
		}
		printMe(list1);
		removeStuff(list1,2,5);
		printMe(list1);
		reverseMe(list1);
		

	}

	private static void reverseMe(List<String> list1) {
		// TODO Auto-generated method stub
		ListIterator<String> bobby=list1.listIterator(list1.size());
		while(bobby.hasPrevious()){
			System.out.printf("%s ",bobby.previous());
			
		}
	}

	private static void removeStuff(List<String> list1, int i, int j) {
		// TODO Auto-generated method stub
		list1.subList(i,j).clear();
	}

	private static void printMe(List<String> list1) {
		// TODO Auto-generated method stub
		for(String b : list1){
			System.out.printf("%s ",b);
			System.out.println();
		}
		
	}

}

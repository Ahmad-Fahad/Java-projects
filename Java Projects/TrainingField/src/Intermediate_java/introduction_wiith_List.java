package Intermediate_java;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;



public class introduction_wiith_List {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] things={"eggs","chair","pie","table","pen"};
		List<String> list1=new ArrayList<String>();
		for(String x : things){
			list1.add(x);
		}
		System.out.println(list1);
		String[] morethings={"pencil","pie","pen"};
		List<String> list2=new ArrayList<String>();
		for(String y : morethings){
			list2.add(y);
		}
		for(int i=0;i<list1.size();i++){
			System.out.printf("%s ",list1.get(i));
		}
		endlist(list1,list2);
		System.out.println();
		for(int i=0;i<list1.size();i++){
			System.out.printf("%s ",list1.get(i));
		}
		  
	}

	private static void endlist(Collection<String> l1, Collection<String> l2) {
		// TODO Auto-generated method stub
		Iterator<String> it = l1.iterator();
		while(it.hasNext()){
			if(l2.contains(it.next()  )){
				it.remove();
				
			}
		}
		
	}

}

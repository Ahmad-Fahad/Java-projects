package Intermediate_java;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class collectionTerm {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] food={"apple","Ghee","mutton","Flesh","meet","rice"};
		List<String> l1=new ArrayList<String>();
		for(String x : food){
		l1.add(x);
		}
		Collections.sort(l1);
		System.out.println(l1);
		Collections.sort(l1,Collections.reverseOrder());
		System.out.println(l1);
		

	}

}

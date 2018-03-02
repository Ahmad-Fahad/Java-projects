package Intermediate_java;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AddingAll {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] stuff={"soldier","Enhineer","Doctor","pilot","captain","major","navy"};
		List<String> l=new ArrayList<String>();
		
		ArrayList<String> li=new ArrayList<String>();
		li.add("Sniper");
		li.add("Bajuka");
		li.add("machinegunMan");
		
		for(String v : li){
			System.out.println(v+" ");
		}
		System.out.println();
		Collections.addAll(li, stuff);
		for(String vp : li){
			System.out.println(vp+" ");
		}
		System.out.println(Collections.frequency(li, "pi"));
		boolean tof=Collections.disjoint(l, li);
		System.out.println(tof);
	}

}

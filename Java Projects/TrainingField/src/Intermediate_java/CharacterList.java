package Intermediate_java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CharacterList {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Character[]  ray={'A','B','C'};
		List<Character> l=new ArrayList<Character>();
			for(Character n : ray){
				l.add(n);
			}
			System.out.println("LIST  IS : ");
			output(l);
			Collections.reverse(l);
			System.out.println("After Reverse : ");
			output(l);
			
			Character[] newRay=new Character[3];
			List<Character> listcopy=new ArrayList<Character>();
			//for(Character d : listcopy){
			//	listcopy.add(d);
		//	}
			System.out.println("Copy of the list : ");
			Collections.copy(listcopy,l);
			output(listcopy);
			
		Collections.fill(l, 'X');
		System.out.println("After Filling The List : ");
		output(l);
	}

	private static void output(List<Character> l) {
		// TODO Auto-generated method stub
		for(Character j : l){
			System.out.println(j+" ");
		}
		
	}

}

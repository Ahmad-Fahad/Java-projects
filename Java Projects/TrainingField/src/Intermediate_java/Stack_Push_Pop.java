package Intermediate_java;

import java.util.Stack;

public class Stack_Push_Pop {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<String> st=new Stack<String>();
		st.push("First");
		printstack(st);
		
		st.push("Second");
		printstack(st);
		
		st.push("Third");
		printstack(st);
		
		System.out.println();
		
		st.pop();
		printstack(st);
		
		st.pop();
		printstack(st);
		
		st.pop();
		printstack(st);
		}

	private static void printstack(Stack<String> st) {
		// TODO Auto-generated method stub
		if(st.isEmpty()){
			System.out.println("There is no element now");
		}else
			System.out.println(st+" TOP ");
		
	}

}

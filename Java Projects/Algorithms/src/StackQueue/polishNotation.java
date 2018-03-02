package StackQueue;

import java.util.Scanner;
import java.util.Stack;

public class polishNotation {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<String> ops=new Stack<String>();
		Stack<Double> vals=new Stack<Double>();
		String s="",l="",k="";
		char[] c=new char[100];
		Scanner ii=new Scanner(System.in);
		for(int i=0;i<7;i++){
			s=ii.nextLine();
			
			if(s.equals("+")){
				ops.push("+");
			}else if(s.equals(")")){
				l=ops.pop();
				if(l.equals("+")){
					vals.push(vals.pop()+vals.pop());
				}
			}else{
				vals.push(Double.parseDouble(s));
			}
		}
		System.out.println(vals.pop());

	}

}

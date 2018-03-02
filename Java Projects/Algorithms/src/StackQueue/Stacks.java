package StackQueue;

import java.util.Scanner;

public class Stacks {
	public static String[] s=new String[10];
	public static int n=0;
	public void push(String p){
		if(n>s.length){
			System.out.println("Overflow");
		}else{
		s[n++]=p;
		}
	}
	public String pop(){
	 
		if(n==-1){
			System.out.println("underflow");
			return null;
		}else
		return s[--n];
		
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stacks k=new  Stacks();
		String p="";
		Scanner ii=new Scanner(System.in);
		for(int i=0;i<10;i++){
			p=ii.nextLine();
			if(p.equals("-")){
				System.out.println(k.pop());
			}else{
				k.push(p);
			}
		}
		

	}

}
